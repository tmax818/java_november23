package co.tylermaxwell.beltprep.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.beltprep.models.Bundle;
import co.tylermaxwell.beltprep.models.User;
import co.tylermaxwell.beltprep.repositories.BundleRepository;
import jakarta.validation.Valid;

@Service
public class BundleService {

    // private final BundleRepository bundleRepository;

    // public BundleService(BundleRepository bundleRepository) {
    //     this.bundleRepository = bundleRepository;
    // }


    @Autowired
    BundleRepository bundleRepository;

    public Bundle addBundle(Bundle bundle, BindingResult result) {
        Optional<Bundle> checkbundle = bundleRepository.findByName(bundle.getName());
        if(!checkbundle.isPresent()){
           return bundleRepository.save(bundle);
        } else {
            result.rejectValue("name", "Name", "already heard that one!!");
            return null;
        }
    }

    public List<Bundle> getAllBundles() {
        return bundleRepository.findAll();
    }

    public Bundle getOneBundle(Long id) {
        Optional<Bundle> bundle = bundleRepository.findById(id);
        return bundle.orElse(null);
    }

    public void updateBundle(Bundle bundle) {
        bundleRepository.save(bundle);
    }

    public void destroyBundle(Long id) {
        bundleRepository.deleteById(id);
    }

    
    

    public boolean addUserVote(Bundle bundle, User user) {
        if(!bundle.getVotes().contains(user)){
            bundle.getVotes().add(user);
            bundleRepository.save(bundle);    
            return true;
        } else {
            return false;
        }
        
    }

    public Bundle getBundleVotes(User user) {
        return bundleRepository.findByVotesContains(user);
    }

    
}
