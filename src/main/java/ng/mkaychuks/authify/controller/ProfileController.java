package ng.mkaychuks.authify.controller;

import lombok.RequiredArgsConstructor;
import ng.mkaychuks.authify.io.ProfileRequest;
import ng.mkaychuks.authify.io.ProfileResponse;
import ng.mkaychuks.authify.service.ProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    public ProfileResponse register(@RequestBody ProfileRequest request){
        ProfileResponse response = profileService.createProfile(request);
        return response;
    }
}
