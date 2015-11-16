// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

final class azk
    implements aqs
{

    private final Context a;

    public azk(Context context)
    {
        a = context;
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        Uri uri;
        uri = (Uri)aqn1.m();
        edf = String.valueOf(aqn1.o());
        aqn1 = String.valueOf(uri);
        eev.e("Conv", (new StringBuilder(String.valueOf(edf).length() + 31 + String.valueOf(aqn1).length())).append("Download of ").append(edf).append(" to ").append(aqn1).append(" Success: ").append(flag).toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        aqn1 = null;
        edf = null;
        OutputStream outputstream = a.getContentResolver().openOutputStream(uri);
        edf = outputstream;
        aqn1 = outputstream;
        eef1.e().compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, outputstream);
        edf = outputstream;
        aqn1 = outputstream;
        if (!eev.a("Conv", 3))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        edf = outputstream;
        aqn1 = outputstream;
        eef1 = String.valueOf(uri);
        edf = outputstream;
        aqn1 = outputstream;
        eev.d("Conv", (new StringBuilder(String.valueOf(eef1).length() + 24)).append("Saved location image to ").append(eef1).toString());
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        outputstream.close();
_L2:
        return;
        eef1;
        eev.e("Conv", "IOException closing output stream", eef1);
        return;
        eef1;
        aqn1 = edf;
        eev.e("Conv", "IOException saving location image", eef1);
        if (edf == null) goto _L2; else goto _L1
_L1:
        try
        {
            edf.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (eef eef1)
        {
            eev.e("Conv", "IOException closing output stream", eef1);
        }
        return;
        eef1;
        if (aqn1 != null)
        {
            try
            {
                aqn1.close();
            }
            // Misplaced declaration of an exception variable
            catch (edf edf)
            {
                eev.e("Conv", "IOException closing output stream", edf);
            }
        }
        throw eef1;
    }
}
