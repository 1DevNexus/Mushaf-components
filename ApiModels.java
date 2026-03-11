package com.isysway.mushaf.api;

import java.util.Map;

public class AppUpdate {
    private int version;
    private String versionName;
    private int updatePriority;
    private String title;
    private String description;

    public AppUpdate(int version, String versionName, int updatePriority, String title, String description) {
        this.version = version;
        this.versionName = versionName;
        this.updatePriority = updatePriority;
        this.title = title;
        this.description = description;
    }

    // Getters
    public int getVersion() { return version; }
    public String getVersionName() { return versionName; }
    public int getUpdatePriority() { return updatePriority; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }

    // Setters
    public void setVersion(int version) { this.version = version; }
    public void setVersionName(String versionName) { this.versionName = versionName; }
    public void setUpdatePriority(int updatePriority) { this.updatePriority = updatePriority; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}

public class ResourcesVersions {
    private Map<String, VersionInfo> translations;
    private Map<String, VersionInfo> quran_scripts;
    private Map<String, VersionInfo> fonts;
    private Map<String, VersionInfo> recitations;
    private Map<String, VersionInfo> tafsirs;
    private Map<String, VersionInfo> other;

    public ResourcesVersions(Map<String, VersionInfo> translations, Map<String, VersionInfo> quran_scripts, 
                           Map<String, VersionInfo> fonts, Map<String, VersionInfo> recitations, 
                           Map<String, VersionInfo> tafsirs, Map<String, VersionInfo> other) {
        this.translations = translations;
        this.quran_scripts = quran_scripts;
        this.fonts = fonts;
        this.recitations = recitations;
        this.tafsirs = tafsirs;
        this.other = other;
    }

    // Getters
    public Map<String, VersionInfo> getTranslations() { return translations; }
    public Map<String, VersionInfo> getQuran_scripts() { return quran_scripts; }
    public Map<String, VersionInfo> getFonts() { return fonts; }
    public Map<String, VersionInfo> getRecitations() { return recitations; }
    public Map<String, VersionInfo> getTafsirs() { return tafsirs; }
    public Map<String, VersionInfo> getOther() { return other; }
}

public class VersionInfo {
    private int version;
    private String lastUpdated;

    public VersionInfo(int version, String lastUpdated) {
        this.version = version;
        this.lastUpdated = lastUpdated;
    }

    // Getters
    public int getVersion() { return version; }
    public String getLastUpdated() { return lastUpdated; }

    // Setters
    public void setVersion(int version) { this.version = version; }
    public void setLastUpdated(String lastUpdated) { this.lastUpdated = lastUpdated; }
}

public class AppUrls {
    private UrlsConfig urls;
    private AppConfig app;
    private SupportConfig support;

    public AppUrls(UrlsConfig urls, AppConfig app, SupportConfig support) {
        this.urls = urls;
        this.app = app;
        this.support = support;
    }

    // Getters
    public UrlsConfig getUrls() { return urls; }
    public AppConfig getApp() { return app; }
    public SupportConfig getSupport() { return support; }
}

public class UrlsConfig {
    private String github;
    private String releases;
    private String issues;
    private String api_base;
    private String cdn_base;
    private String playStore;
    private String website;
    private String privacyPolicy;
    private String termsOfService;
    private String feedback;
    private String donate;

    public UrlsConfig(String github, String releases, String issues, String api_base, String cdn_base,
                     String playStore, String website, String privacyPolicy, String termsOfService,
                     String feedback, String donate) {
        this.github = github;
        this.releases = releases;
        this.issues = issues;
        this.api_base = api_base;
        this.cdn_base = cdn_base;
        this.playStore = playStore;
        this.website = website;
        this.privacyPolicy = privacyPolicy;
        this.termsOfService = termsOfService;
        this.feedback = feedback;
        this.donate = donate;
    }

    // Getters and Setters for all fields...
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    // ... similar getters/setters for other fields
}

public class AppConfig {
    private String package_name;
    private String source;

    public AppConfig(String package_name, String source) {
        this.package_name = package_name;
        this.source = source;
    }

    // Getters and Setters
    public String getPackage_name() { return package_name; }
    public void setPackage_name(String package_name) { this.package_name = package_name; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
}

public class SupportConfig {
    private String email;
    private String telegram;

    public SupportConfig(String email, String telegram) {
        this.email = email;
        this.telegram = telegram;
    }

    // Getters and Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelegram() { return telegram; }
    public void setTelegram(String telegram) { this.telegram = telegram; }
}
