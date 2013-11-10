package com.crownpartners.cms;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.*;

import javax.annotation.Resource;

@Controller
public class HomePageController {

    @Resource
    CMSPageService cmsPageService;

    @Resource
    CatalogVersionService catalogVersionService;


	@RequestMapping("/")
	public String homepage(Model model) throws CMSItemNotFoundException {

        CatalogVersionModel catalogVersion = catalogVersionService.getCatalogVersion("demoContentCatalog", "Default");

        catalogVersionService.addSessionCatalogVersion(catalogVersion);

        ContentPageModel cmsPage = cmsPageService.getPageForLabelOrId("homepage");

        model.addAttribute("cmsPage", cmsPage);

        return "/homepage";
	}

}