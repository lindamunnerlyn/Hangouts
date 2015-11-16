// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.apps.hangouts.realtimechat.DebugService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler;
import java.util.Iterator;
import java.util.List;

final class coc
    implements ilx
{

    private final Context a;

    coc(Context context)
    {
        a = context;
    }

    public void a()
    {
        ecd.a("HangoutsStartup");
        g.nS = a;
        if (ebw.a("Babel_strictmode"))
        {
            ebw.e("Babel", "Enable strict logging early due to tag");
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
        }
        Object obj;
        if (Log.isLoggable("Babel_profile", 3))
        {
            obj = ebw.y;
        }
        Object obj1;
        int i;
        boolean flag;
        try
        {
            NativeCrashHandler.a(a);
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            ebw.e("Babel", "Error installing NativeCrashHandler", unsatisfiedlinkerror);
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            ebw.e("Babel", "Failed to load NativeCrashHandler", nosuchmethoderror);
        }
        gbh.a();
        ebz.a();
        obj = a;
        obj1 = new Thread(new cof());
        ((Thread) (obj1)).setName("otherBackgroundInitialization");
        ((Thread) (obj1)).start();
        gbk.a(g.a(((Context) (obj)), "babel_server_request_timeout", 40000));
        dcx.b();
        g.e(a);
        dqv.a(a);
        obj1 = a;
        flag = dbf.j();
        obj = ((Context) (obj1)).getPackageManager();
        obj1 = new ComponentName(((Context) (obj1)), "com.google.android.apps.hangouts.phone.ShareIntentSmsOnlyActivity");
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        ((PackageManager) (obj)).setComponentEnabledSetting(((ComponentName) (obj1)), i, 1);
        dqh.a();
        gbh.b(bnd.a());
        g.a(a).a(new cod(this));
        b();
        new com(a);
        dkz.a();
        SmsReceiver.a();
        for (obj = hgx.c(a, cjc).iterator(); ((Iterator) (obj)).hasNext(); ((cjc)((Iterator) (obj)).next()).a(a)) { }
        android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks;
        for (nosuchmethoderror = hgx.c(a, android/app/Application$ActivityLifecycleCallbacks).iterator(); nosuchmethoderror.hasNext(); ((Application)a).registerActivityLifecycleCallbacks(activitylifecyclecallbacks))
        {
            activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)nosuchmethoderror.next();
        }

        nosuchmethoderror = (ecs)hgx.a(a, ecs);
        if ((nosuchmethoderror.b() || nosuchmethoderror.a()) && android.os.Build.VERSION.SDK_INT >= 16)
        {
            android.os.StrictMode.ThreadPolicy.Builder builder = new android.os.StrictMode.ThreadPolicy.Builder();
            android.os.StrictMode.VmPolicy.Builder builder1 = new android.os.StrictMode.VmPolicy.Builder();
            builder.detectAll();
            builder1.detectAll();
            builder.penaltyLog();
            builder1.penaltyLog();
            if (nosuchmethoderror.a())
            {
                ebw.e("Babel", "Enable strict mode dialog.");
                builder.penaltyDialog();
            } else
            {
                ebw.e("Babel", "Enable strict logging.");
            }
            StrictMode.setThreadPolicy(builder.build());
            StrictMode.setVmPolicy(builder1.build());
        }
        if ((bdu)hgx.b(a, bdu) != null)
        {
            ebw.a("Babel", "Starting PerfPressure module.");
        }
        ebw.a("Babel", "EsApplication.onCreate ended");
        a.registerComponentCallbacks(new coe(this));
        ecd.a();
    }

    void b()
    {
        alw alw1 = g.a(a);
        boolean flag = ((ecs)hgx.a(a, ecs)).a();
        boolean flag1 = alw1.a("babel_asserts", true);
        if (alw1.a("babel_expensive_asserts", false) || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag1, flag);
        ebw.a();
        DebugService.a(a);
    }
}
