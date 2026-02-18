package ng.mkaychuks.authify.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ng.mkaychuks.authify.io.ProfileRequest;
import ng.mkaychuks.authify.io.ProfileResponse;
import ng.mkaychuks.authify.service.ProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    public ProfileResponse register(@Valid @RequestBody ProfileRequest request){
        ProfileResponse response = profileService.createProfile(request);
        return response;
    }
}
