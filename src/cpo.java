// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class cpo
    implements Runnable
{

    final Uri a;
    final ViewVCardActivity b;

    public cpo(ViewVCardActivity viewvcardactivity, Uri uri)
    {
        b = viewvcardactivity;
        a = uri;
        super();
    }

    public void run()
    {
        aem aem1 = new aem();
        aew aew1 = new aew();
        boolean flag;
        try
        {
            flag = ViewVCardActivity.a(b, a, 0, aew1, true);
        }
        catch (afe afe2)
        {
            try
            {
                int i = aew1.c();
                flag = ViewVCardActivity.a(b, a, i, aem1, false);
            }
            catch (afe afe1)
            {
                String s = String.valueOf(afe1);
                Log.e("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Must not reach here. ").append(s).toString());
                flag = false;
            }
        }
        if (!flag)
        {
            ViewVCardActivity.e(b).post(new cpp(this));
            return;
        } else
        {
            ViewVCardActivity.a(b, a, aew1);
            return;
        }
    }
}
