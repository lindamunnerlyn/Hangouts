// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

public final class eei
{

    private static final String a[];

    public static boolean a(Context context, String s)
    {
        Object obj;
        PackageInfo packageinfo;
        obj = String.valueOf(s);
        PackageManager packagemanager;
        int i;
        if (((String) (obj)).length() != 0)
        {
            obj = "Checking signature of ".concat(((String) (obj)));
        } else
        {
            obj = new String("Checking signature of ");
        }
        eev.a("Babel", ((String) (obj)));
        obj = MessageDigest.getInstance("SHA1");
        packagemanager = context.getPackageManager();
        packageinfo = packagemanager.getPackageInfo(s, 64);
        context = packagemanager.getPackageInfo(context.getPackageName(), 64);
        if (((PackageInfo) (context)).signatures.length == 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        i = ((PackageInfo) (context)).signatures.length;
        eev.g("Babel", (new StringBuilder(40)).append("Self signed with ").append(i).append(" signatures.").toString());
        return false;
        Signature signature;
        signature = ((PackageInfo) (context)).signatures[0];
        context = String.valueOf(g.a(((MessageDigest) (obj)).digest(signature.toByteArray())));
        if (context.length() == 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        context = "Self signature: ".concat(context);
_L1:
        eev.a("Babel", context);
        if (packageinfo.signatures.length > 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        eev.g("Babel", "Package signed with < 1 signature.");
        return false;
        Signature asignature[];
        Signature signature1;
        String s1;
        int j;
        int k;
        try
        {
            context = new String("Self signature: ");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eev.e("Babel", "checkForValidSignature caught", context);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(s);
            if (context.length() != 0)
            {
                context = "checkForValidSignature could not find ".concat(context);
            } else
            {
                context = new String("checkForValidSignature could not find ");
            }
            eev.c("Babel", context);
            return false;
        }
          goto _L1
        asignature = packageinfo.signatures;
        k = asignature.length;
        j = 0;
_L7:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        signature1 = asignature[j];
        s1 = g.a(((MessageDigest) (obj)).digest(signature1.toByteArray()));
        context = String.valueOf(s1);
        if (context.length() == 0) goto _L3; else goto _L2
_L2:
        context = "Checking signature: ".concat(context);
_L5:
        eev.a("Babel", context);
        if (Arrays.binarySearch(a, s1) >= 0)
        {
            eev.a("Babel", "Found a match in the allowed signatures.");
            break MISSING_BLOCK_LABEL_417;
        }
        break; /* Loop/switch isn't completed */
_L3:
        context = new String("Checking signature: ");
        if (true) goto _L5; else goto _L4
_L4:
        if (signature1.equals(signature))
        {
            eev.a("Babel", "Signature matches self signature.");
            break MISSING_BLOCK_LABEL_417;
        }
        context = String.valueOf(signature1);
        eev.g("Babel", (new StringBuilder(String.valueOf(context).length() + 30)).append("Unrecognized signature found: ").append(context).toString());
        return false;
        eev.a("Babel", "Signature is valid.");
        return true;
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        int i = 0;
        for (a = (new String[] {
    "24BB24C05E47E0AEFA68A58A766179D9B613A600", "2A3B2FF537ECE7A1D88388ADDE13DE707B5CAD50", "38918A453D07199354F8B19AF05EC6562CED5788", "3AE924E5358572D2129B3479D99EB2C6D2360161", "5BC4FF008D6CE61D08F0418745EB403753AF76E7", "B6FA7B8B25BF050925AE82CD5608132B5FA0871A", "BE69110A4B3B1626A11F50A5F6A9A0922AD6F5D1", "038BAA00FC34F1EF9F7BE561B8656378863E3019", "D384B03B29D313E480BAF95336973B8698CF09C1", "AF362590931B148FC5D8FC3CAD5D2D2FEFAFE5C4"
}); i < a.length; i++)
        {
            a[i] = a[i].toUpperCase(Locale.US);
        }

        Arrays.sort(a);
    }
}
