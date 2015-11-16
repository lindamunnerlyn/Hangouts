// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;

public final class eld
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private static String a(Context context, Account account, String s, Bundle bundle)
    {
        return b(context, account, s, bundle).getString("authtoken");
    }

    public static String a(Context context, String s, String s1)
    {
        return a(context, new Account(s, "com.google"), s1, new Bundle());
    }

    private static void a(Context context)
    {
        try
        {
            emo.b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ele(context.a(), context.getMessage(), context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new elc(context.getMessage());
        }
    }

    public static void a(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    private static Bundle b(Context context, Account account, String s, Bundle bundle)
    {
        Object obj;
        obj = context.getApplicationContext();
        g.z("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (TextUtils.isEmpty(bundle.getString(b)))
        {
            bundle.putString(b, context);
        }
        context = new ers();
        obj = eqm.a(((Context) (obj)));
        if (!((eqm) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_448;
        }
        s = fgv.a(context.a()).a(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        throw new elc("ServiceUnavailable");
        account;
        throw new IOException("remote exception");
        account;
        ((eqm) (obj)).b(c, context, "GoogleAuthUtil");
        throw account;
        boolean flag1 = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag1)
        {
            ((eqm) (obj)).b(c, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        boolean flag;
        if (!"BadAuthentication".equals(account) && !"CaptchaRequired".equals(account) && !"DeviceManagementRequiredOrSyncDisabled".equals(account) && !"NeedPermission".equals(account) && !"NeedsBrowser".equals(account) && !"UserCancel".equals(account) && !"AppDownloadRequired".equals(account) && !elh.u.a().equals(account) && !elh.v.a().equals(account) && !elh.w.a().equals(account) && !elh.x.a().equals(account) && !elh.y.a().equals(account) && !elh.z.a().equals(account) && !elh.s.a().equals(account))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        throw new elf(account, s);
        account;
        throw new elc("Interrupted");
        if ("NetworkError".equals(account) || "ServiceUnavailable".equals(account) || "Timeout".equals(account))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_439;
        }
        throw new IOException(account);
        throw new elc(account);
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String b(Context context, String s, String s1)
    {
        return a(context, new Account(s, "com.google"), s1, null);
    }

    public static void b(Context context, String s)
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        g.z("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(b))
        {
            ((Bundle) (obj1)).putString(b, context);
        }
        context = new ers();
        obj = eqm.a(((Context) (obj)));
        if (!((eqm) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s = fgv.a(context.a()).a(s, ((Bundle) (obj1)));
        obj1 = s.getString("Error");
        if (!s.getBoolean("booleanResult"))
        {
            throw new elc(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_146;
        s;
        throw new IOException("remote exception");
        s;
        ((eqm) (obj)).b(c, context, "GoogleAuthUtil");
        throw s;
        ((eqm) (obj)).b(c, context, "GoogleAuthUtil");
        return;
        s;
        throw new elc("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static Bundle c(Context context, Account account, String s, Bundle bundle)
    {
        try
        {
            account = b(context, account, s, bundle);
            emo.c(context);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            emo.a(account.a(), context);
            throw new elg("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            emo.c(context);
            throw new elg("User intervention required. Notification has been pushed.");
        }
        return account;
    }

    public static String c(Context context, String s, String s1)
    {
        s = new Account(s, "com.google");
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        return c(context, ((Account) (s)), s1, bundle).getString("authtoken");
    }

    public static Account[] c(Context context, String s)
    {
        boolean flag;
        flag = true;
        eml.a();
        eml.b(context);
        g.x(s);
        if (!g.k(22)) goto _L2; else goto _L1
_L1:
        if (!g.k(23)) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            return d(context, s);
        } else
        {
            return AccountManager.get(context).getAccountsByType(s);
        }
_L4:
        switch (android.os.Build.VERSION.CODENAME.charAt(0))
        {
        case 77: // 'M'
        case 78: // 'N'
            break;
        }
_L2:
        flag = false;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static Account[] d(Context context, String s)
    {
        int i;
        i = 0;
        context = ((Context)g.d(context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (context == null)
        {
            return new Account[0];
        }
        Account aaccount[];
        s = context.call("get_accounts", s, new Bundle()).getParcelableArray("accounts");
        aaccount = new Account[s.length];
_L1:
        if (i >= s.length)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        aaccount[i] = (Account)s[i];
        i++;
          goto _L1
        context.release();
        return aaccount;
        s;
        context.release();
        throw s;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
    }
}
