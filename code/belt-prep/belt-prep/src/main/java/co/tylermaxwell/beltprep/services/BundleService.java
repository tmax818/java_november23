package co.tylermaxwell.beltprep.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.beltprep.models.Bundle;
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

    public void addBundle(Bundle bundle) {
        bundleRepository.save(bundle);
    }

    public List<Bundle> getAllNames() {
        return bundleRepository.findAll();
    }

    public Bundle getOneBundleById(Long id) {
        Optional<Bundle> bundle = bundleRepository.findById(id);
        return bundle.orElse(null);
    }

    public void updateBundle(@Valid Bundle bundle) {
        bundleRepository.save(bundle);
    }

    public void destroyBundle(Long id) {
        bundleRepository.deleteById(id);
    }

    
}
