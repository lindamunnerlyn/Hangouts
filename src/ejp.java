// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

public final class ejp
{

    private static final ejp a = new ejp();

    private ejp()
    {
    }

    public static ejp a()
    {
        return a;
    }

    static transient eox a(PackageInfo packageinfo, eox aeox[])
    {
        if (packageinfo.signatures.length != 1)
        {
            return null;
        }
        packageinfo = new ery(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < aeox.length; i++)
        {
            if (aeox[i].equals(packageinfo))
            {
                return aeox[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.a(), 0));
        }
        return null;
    }

    private static boolean a(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            return false;
        }
        ery ery1 = new ery(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = eow.a();
        } else
        {
            packageinfo = eow.b();
        }
        if (packageinfo.contains(ery1))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(ery1.a(), 0));
        }
        return false;
    }

    public void a(PackageManager packagemanager, int i)
    {
        boolean flag1 = false;
        if (packagemanager == null)
        {
            throw new SecurityException("Unknown error: invalid Package Manager");
        }
        String as[] = packagemanager.getPackagesForUid(i);
        boolean flag = flag1;
        if (as != null)
        {
            if (as.length == 0)
            {
                flag = flag1;
            } else
            {
                flag = a(packagemanager, as[0]);
            }
        }
        if (!flag)
        {
            throw new SecurityException("Uid is not Google Signed");
        } else
        {
            return;
        }
    }

    public boolean a(PackageManager packagemanager, String s)
    {
        boolean flag = false;
        PackageInfo packageinfo = packagemanager.getPackageInfo(s, 64);
        if (packageinfo != null) goto _L2; else goto _L1
_L1:
        return flag;
        packagemanager;
        if (Log.isLoggable("GoogleSignatureVerifier", 3))
        {
            (new StringBuilder("Package manager can't find package ")).append(s).append(", defaulting to false");
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (ejn.a(packagemanager))
        {
            return a(packageinfo, true);
        }
        boolean flag1 = a(packageinfo, false);
        flag = flag1;
        if (!flag1)
        {
            a(packageinfo, true);
            return flag1;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
