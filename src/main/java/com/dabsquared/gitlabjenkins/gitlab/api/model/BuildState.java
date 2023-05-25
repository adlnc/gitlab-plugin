package com.dabsquared.gitlabjenkins.gitlab.api.model;

/**
 * @author Robin Müller
 */
public enum BuildState {
    canceled,
    created,
    failed,
    manual,
    pending,
    preparing,
    running,
    scheduled,
    skipped,
    success,
    waiting_for_resource
}
