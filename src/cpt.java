// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.apps.hangouts.realtimechat.DebugService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler;
import java.util.Iterator;
import java.util.List;

public final class cpt
    implements irl
{

    private static final efh a = efh.a("HangoutsAppStartupListener");
    private final Context b;
    private final bye c;

    cpt(Context context, byf byf1)
    {
        b = context;
        c = byf1.a(17);
    }

    static void a(cpt cpt1)
    {
        cpt1.b();
    }

    private void b()
    {
        amo amo1 = g.a(b);
        boolean flag = ((efu)hlp.a(b, efu)).a();
        boolean flag1 = amo1.a("babel_asserts", true);
        if (amo1.a("babel_expensive_asserts", false) || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a = flag1;
        gdv.b = flag;
        eev.a();
        DebugService.a(b);
    }

    public void a()
    {
        a.b("onApplicationStartup");
        c.a("hangout_launch_icon");
        g.nU = b;
        if (eev.a("Babel_strictmode"))
        {
            eev.e("Babel", "Enable strict logging early due to tag");
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
        }
        Object obj;
        if (Log.isLoggable("Babel_profile", 3))
        {
            obj = eev.y;
        }
        Object obj1;
        int i;
        boolean flag;
        boolean flag1;
        try
        {
            NativeCrashHandler.a(b);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eev.e("Babel", "Error installing NativeCrashHandler", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eev.e("Babel", "Failed to load NativeCrashHandler", ((Throwable) (obj)));
        }
        gdv.a();
        eey.a();
        obj = b;
        obj1 = new Thread(new cpw());
        ((Thread) (obj1)).setName("otherBackgroundInitialization");
        ((Thread) (obj1)).start();
        gdy.d = (long)g.a(((Context) (obj)), "babel_server_request_timeout", 40000) + 10000L;
        def.b();
        flag = g.e(b);
        if (flag)
        {
            PreferenceManager.getDefaultSharedPreferences(b).edit().putLong("first_launch", System.currentTimeMillis()).apply();
        }
        dtp.a(b);
        obj1 = b;
        flag1 = dcn.j();
        obj = ((Context) (obj1)).getPackageManager();
        obj1 = new ComponentName(((Context) (obj1)), "com.google.android.apps.hangouts.phone.ShareIntentSmsOnlyActivity");
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        ((PackageManager) (obj)).setComponentEnabledSetting(((ComponentName) (obj1)), i, 1);
        dtb.a();
        gdv.b("Expected non-null", bnk.a());
        g.a(b).a(new cpu(this));
        b();
        new cqc(b, flag);
        dnw.a();
        SmsReceiver.a();
        obj = hlp.b(b);
        for (obj1 = ((hlp) (obj)).c(ckh).iterator(); ((Iterator) (obj1)).hasNext(); ((ckh)((Iterator) (obj1)).next()).a(b)) { }
        android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks;
        for (obj1 = ((hlp) (obj)).c(android/app/Application$ActivityLifecycleCallbacks).iterator(); ((Iterator) (obj1)).hasNext(); ((Application)b).registerActivityLifecycleCallbacks(activitylifecyclecallbacks))
        {
            activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)((Iterator) (obj1)).next();
        }

        obj1 = (efu)((hlp) (obj)).a(efu);
        if ((((efu) (obj1)).b() || ((efu) (obj1)).a()) && android.os.Build.VERSION.SDK_INT >= 16)
        {
            android.os.StrictMode.ThreadPolicy.Builder builder = new android.os.StrictMode.ThreadPolicy.Builder();
            android.os.StrictMode.VmPolicy.Builder builder1 = new android.os.StrictMode.VmPolicy.Builder();
            builder.detectAll();
            builder1.detectAll();
            builder.penaltyLog();
            builder1.penaltyLog();
            if (((efu) (obj1)).a())
            {
                eev.e("Babel", "Enable strict mode dialog.");
                builder.penaltyDialog();
            } else
            {
                eev.e("Babel", "Enable strict logging.");
            }
            StrictMode.setThreadPolicy(builder.build());
            StrictMode.setVmPolicy(builder1.build());
        }
        if ((bek)((hlp) (obj)).b(bek) != null)
        {
            eev.a("Babel", "Starting PerfPressure module.");
        }
        eev.a("Babel", "EsApplication.onCreate ended");
        b.registerComponentCallbacks(new cpv(this));
        obj = b;
        eev.e("Babel_Prime", "startMemoryMonitor");
        hlp.a(((Context) (obj)), gob);
        gob.a();
        a.c("onApplicationStartup");
    }

}
