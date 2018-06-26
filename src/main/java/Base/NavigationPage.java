package Base;

public class NavigationPage {

    public String getUrl(String pageName) {
        String url = "url";

        switch (pageName) {
            case "HomePage":
                url = "https://www.xpanxion.com/";
            break;

            case "WhatWeDoPage":
                url = "https://www.xpanxion.com/services/";
            break;

            case "OurWorkPage":
                url = "https://www.xpanxion.com/case-studies/";
            break;

            case "WhoWeArePage":
                url = "https://www.xpanxion.com/about-us/";
            break;

            case "CareersPage":
                url = "https://www.xpanxion.com/careers/";
            break;

            case "ContactUsPage":
                url = "https://www.xpanxion.com/contact/";
            break;
        }
        return url;
    }
}
