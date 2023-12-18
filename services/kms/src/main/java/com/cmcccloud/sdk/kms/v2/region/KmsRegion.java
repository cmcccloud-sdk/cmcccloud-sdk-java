package com.cmcccloud.sdk.kms.v2.region;

import com.cmcccloud.sdk.core.region.IRegionProvider;
import com.cmcccloud.sdk.core.region.Region;
import com.cmcccloud.sdk.core.region.RegionProviderChain;
import com.cmcccloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class KmsRegion {

    public static final Region CIDC_RP_11 = new Region("CIDC-RP-11", "https://kms.cidc-rp-11.joint.cmecloud.cn");

    public static final Region CIDC_RP_12 = new Region("CIDC-RP-12", "https://kms.cidc-rp-12.joint.cmecloud.cn");

    public static final Region CIDC_RP_13 = new Region("CIDC-RP-13", "https://kms.cidc-rp-13.joint.cmecloud.cn");

    public static final Region CIDC_RP_19 = new Region("CIDC-RP-19", "https://kms.cidc-rp-19.joint.cmecloud.cn");

    public static final Region CIDC_RP_2000 = new Region("CIDC-RP-2000", "https://kms.cidc-rp-2000.joint.cmecloud.cn");

    public static final Region CIDC_RP_2005 = new Region("CIDC-RP-2005", "https://kms.cidc-rp-2005.joint.cmecloud.cn");

    public static final Region CIDC_RP_2006 = new Region("CIDC-RP-2006", "https://kms.cidc-rp-2006.joint.cmecloud.cn");

    public static final Region CIDC_RP_2011 = new Region("CIDC-RP-2011", "https://kms.cidc-rp-2011.joint.cmecloud.cn");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("KMS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("CIDC-RP-11", CIDC_RP_11);
        map.put("CIDC-RP-12", CIDC_RP_12);
        map.put("CIDC-RP-13", CIDC_RP_13);
        map.put("CIDC-RP-19", CIDC_RP_19);
        map.put("CIDC-RP-2000", CIDC_RP_2000);
        map.put("CIDC-RP-2005", CIDC_RP_2005);
        map.put("CIDC-RP-2006", CIDC_RP_2006);
        map.put("CIDC-RP-2011", CIDC_RP_2011);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
