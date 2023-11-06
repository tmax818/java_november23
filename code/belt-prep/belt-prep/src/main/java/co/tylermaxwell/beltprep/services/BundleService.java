package co.tylermaxwell.beltprep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.beltprep.repositories.BundleRepository;

@Service
public class BundleService {

    // private final BundleRepository bundleRepository;

    // public BundleService(BundleRepository bundleRepository) {
    //     this.bundleRepository = bundleRepository;
    // }


    @Autowired
    BundleRepository bundleRepository;

    
}
