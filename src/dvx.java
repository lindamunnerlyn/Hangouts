// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfoCdma;
import android.telephony.TelephonyManager;

public final class dvx
{

    static final int a[] = {
        4103, 4106, 4107, 4120, 4121, 4124, 4126, 4132, 4135, 4139, 
        4144, 4145, 4148, 4151, 4153, 4155, 4157, 4159, 4162, 4164, 
        4166, 4168, 4170, 4171, 4174, 4180, 4181, 4183, 4186, 4188, 
        4190, 4195, 4198, 4274, 4376, 4384, 4390, 4396, 4418, 4622, 
        4654, 4694, 4812, 4982, 5116, 5142, 22404, 22405, 22406, 22407, 
        22408, 22409, 22410, 22411, 22412, 22413, 22414, 22415, 22416, 22417, 
        22418, 22419, 22420, 22421, 22422, 22423, 22424, 22425, 22426, 22427, 
        22428, 22430, 22431, 22432, 22434, 22435, 22436, 22437, 22438, 22439, 
        22440, 22441, 22442, 22443, 22444, 22445, 22446, 22447, 22448
    };

    public static int a(Context context)
    {
        TelephonyManager telephonymanager;
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        if (telephonymanager.isNetworkRoaming())
        {
            ebw.e("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, is roaming");
            return 1;
        }
        context = dtt.a(context);
        if (context == null)
        {
            ebw.e("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, unable to get cell info, roaming status is unknown");
            return 3;
        }
        if (telephonymanager.getPhoneType() != 2 || !(context instanceof CellInfoCdma)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        j = ((CellInfoCdma)context).getCellIdentity().getSystemId();
        context = a;
        k = context.length;
        i = 0;
_L9:
        if (i >= k) goto _L4; else goto _L3
_L3:
        if (j != context[i]) goto _L6; else goto _L5
_L5:
        i = 1;
_L7:
        if (i == 0)
        {
            ebw.e("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, not on Sprint Cdma, is roaming");
            return 1;
        }
        break; /* Loop/switch isn't completed */
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return 2;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
