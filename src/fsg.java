// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class fsg extends epl
    implements ftl
{

    public fsg(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String a()
    {
        return b("account_name");
    }

    public boolean b()
    {
        return d() != null;
    }

    public String c()
    {
        String s1 = b("display_name");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = a();
        }
        return s;
    }

    public String d()
    {
        return b("page_gaia_id");
    }

    public String e()
    {
        return d();
    }

    public String f()
    {
        return fsi.a.a(b("avatar"));
    }

    public String g()
    {
        return fsi.a.a(b("cover_photo_url"));
    }
}
