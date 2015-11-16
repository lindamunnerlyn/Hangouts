// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import junit.framework.Assert;

class gxx
{

    Context a;

    public gxx(Context context)
    {
        a = context;
    }

    public String a()
    {
        String s;
        try
        {
            s = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Assert.fail();
            return "";
        }
        return s;
    }
}
