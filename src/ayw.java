// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

final class ayw
    implements aqb
{

    private final Context a;

    public ayw(Context context)
    {
        a = context;
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        Uri uri;
        uri = (Uri)apw1.l();
        eab = String.valueOf(apw1.n());
        apw1 = String.valueOf(uri);
        ebw.e("Conv", (new StringBuilder(String.valueOf(eab).length() + 31 + String.valueOf(apw1).length())).append("Download of ").append(eab).append(" to ").append(apw1).append(" Success: ").append(flag).toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        apw1 = null;
        eab = null;
        OutputStream outputstream = a.getContentResolver().openOutputStream(uri);
        eab = outputstream;
        apw1 = outputstream;
        ebh1.e().compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, outputstream);
        eab = outputstream;
        apw1 = outputstream;
        if (!ebw.a("Conv", 3))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        eab = outputstream;
        apw1 = outputstream;
        ebh1 = String.valueOf(uri);
        eab = outputstream;
        apw1 = outputstream;
        ebw.d("Conv", (new StringBuilder(String.valueOf(ebh1).length() + 24)).append("Saved location image to ").append(ebh1).toString());
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        outputstream.close();
_L2:
        return;
        ebh1;
        ebw.e("Conv", "IOException closing output stream", ebh1);
        return;
        ebh1;
        apw1 = eab;
        ebw.e("Conv", "IOException saving location image", ebh1);
        if (eab == null) goto _L2; else goto _L1
_L1:
        try
        {
            eab.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ebh ebh1)
        {
            ebw.e("Conv", "IOException closing output stream", ebh1);
        }
        return;
        ebh1;
        if (apw1 != null)
        {
            try
            {
                apw1.close();
            }
            // Misplaced declaration of an exception variable
            catch (eab eab)
            {
                ebw.e("Conv", "IOException closing output stream", eab);
            }
        }
        throw ebh1;
    }
}
