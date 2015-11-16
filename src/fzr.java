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

public final class fzr
{

    public final GoogleHelp a;
    public fah b;
    public boolean c;

    public fzr(String s)
    {
        a = GoogleHelp.a(s);
    }

    private fah a()
    {
        if (b == null)
        {
            b = new fah();
        }
        return b;
    }

    private fzr a(Bitmap bitmap)
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

    public fzr a(Account account)
    {
        a.a(account);
        return this;
    }

    public fzr a(Activity activity)
    {
        a(GoogleHelp.a(activity));
        return this;
    }

    public fzr a(Uri uri)
    {
        a.a(uri);
        return this;
    }

    public fzr a(Bundle bundle)
    {
        a().a(bundle);
        return this;
    }

    public fzr a(fzv fzv1)
    {
        a.a((new ThemeSettings()).b(fzv1.b()).a(fzv1.c()));
        return this;
    }

    public fzr a(String s, Intent intent)
    {
        a.a(0, s, intent);
        return this;
    }
}
