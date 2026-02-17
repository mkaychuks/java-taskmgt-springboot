package ng.mkaychuks.authify.service;

import ng.mkaychuks.authify.io.ProfileRequest;
import ng.mkaychuks.authify.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
