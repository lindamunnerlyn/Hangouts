// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class crf
    implements Runnable
{

    final Uri a;
    final ViewVCardActivity b;

    public crf(ViewVCardActivity viewvcardactivity, Uri uri)
    {
        b = viewvcardactivity;
        a = uri;
        super();
    }

    public void run()
    {
        aeo aeo1 = new aeo();
        aey aey1 = new aey();
        boolean flag;
        try
        {
            flag = ViewVCardActivity.a(b, a, 0, aey1, true);
        }
        catch (afg afg2)
        {
            try
            {
                int i = aey1.c();
                flag = ViewVCardActivity.a(b, a, i, aeo1, false);
            }
            catch (afg afg1)
            {
                String s = String.valueOf(afg1);
                Log.e("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Must not reach here. ").append(s).toString());
                flag = false;
            }
        }
        if (!flag)
        {
            ViewVCardActivity.e(b).post(new crg(this));
            return;
        } else
        {
            ViewVCardActivity.a(b, a, aey1);
            return;
        }
    }
}
