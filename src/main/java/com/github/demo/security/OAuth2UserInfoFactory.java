package com.github.demo.security;

import com.github.demo.enums.AuthProvider;
import com.github.demo.exception.OAuth2AuthenticationProcessingException;
import com.github.demo.util.GithubOAuth2UserInfo;
import com.github.demo.util.OAuth2UserInfo;

import java.util.Map;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
