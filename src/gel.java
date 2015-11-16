// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

public final class gel
{

    private static final String a[] = {
        "OMX.google.", "OMX.SEC.", "OMX.Intel.VideoEncoder.VP8"
    };

    public static int a(boolean flag)
    {
        int i = 0;
        if (a("video/x-vnd.on2.vp8", flag))
        {
            i = 1;
        }
        int j = i;
        if (a("video/avc", flag))
        {
            j = i | 2;
        }
        return j;
    }

    private static boolean a(String s, boolean flag)
    {
_L2:
        return false;
        if (android.os.Build.VERSION.SDK_INT < 18 || flag && (android.os.Build.VERSION.SDK_INT < 19 || "video/x-vnd.on2.vp8".equals(s) && android.os.Build.VERSION.SDK_INT < 21)) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = MediaCodecList.getCodecCount();
        j = 0;
_L17:
        if (j >= k) goto _L4; else goto _L3
_L3:
        MediaCodecInfo mediacodecinfo;
        String as[];
        int i;
        mediacodecinfo = MediaCodecList.getCodecInfoAt(j);
        as = mediacodecinfo.getSupportedTypes();
        i = 0;
_L13:
        if (i >= as.length) goto _L6; else goto _L5
_L5:
        if (!as[i].equalsIgnoreCase(s)) goto _L8; else goto _L7
_L7:
        i = 1;
_L14:
        int l;
        if (i == 0 || mediacodecinfo.isEncoder() != flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = a;
        l = as.length;
        i = 0;
_L15:
        if (i >= l) goto _L10; else goto _L9
_L9:
        String s1 = as[i];
        if (!mediacodecinfo.getName().startsWith(s1)) goto _L12; else goto _L11
_L11:
        i = 0;
_L16:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = mediacodecinfo;
_L18:
        if (s != null)
        {
            return true;
        }
          goto _L2
_L8:
        i++;
          goto _L13
_L6:
        i = 0;
          goto _L14
_L12:
        i++;
          goto _L15
_L10:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                break label0;
            }
            Object obj = mediacodecinfo.getCapabilitiesForType(s);
            if (obj == null)
            {
                i = 0;
            } else
            {
                obj = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).getVideoCapabilities();
                if (obj == null || !((android.media.MediaCodecInfo.VideoCapabilities) (obj)).areSizeAndRateSupported(1280, 720, 30D))
                {
                    i = 0;
                } else
                {
                    i = 1;
                }
            }
            if (i != 0)
            {
                break label0;
            }
            i = 0;
        }
          goto _L16
        i = 1;
          goto _L16
        j++;
          goto _L17
_L4:
        s = null;
          goto _L18
    }

}
