// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

public final class gcf
{

    public final GoogleHelp a;
    public fdf b;
    public boolean c;

    public gcf(String s)
    {
        a = GoogleHelp.a(s);
    }

    private fdf a()
    {
        if (b == null)
        {
            b = new fdf();
        }
        return b;
    }

    private gcf a(Bitmap bitmap)
    {
        a().a(bitmap);
        return this;
    }

    public Intent a(Context context)
    {
        if (c)
        {
            throw new IllegalStateException("Cannot call buildHelpIntent twice");
        }
        c = true;
        if (b != null)
        {
            a.a(b.a(), context.getCacheDir());
        }
        return a.a();
    }

    public gcf a(Account account)
    {
        a.a(account);
        return this;
    }

    public gcf a(Activity activity)
    {
        a(GoogleHelp.a(activity));
        return this;
    }

    public gcf a(Uri uri)
    {
        a.a(uri);
        return this;
    }

    public gcf a(Bundle bundle)
    {
        a().a(bundle);
        return this;
    }

    public gcf a(gcj gcj1)
    {
        a.a((new ThemeSettings()).b(gcj1.b()).a(gcj1.c()));
        return this;
    }

    public gcf a(String s, Intent intent)
    {
        a.a(0, s, intent);
        return this;
    }

    public gcf a(String s, String s1, byte abyte0[])
    {
        a().a(s, s1, abyte0);
        return this;
    }
}
