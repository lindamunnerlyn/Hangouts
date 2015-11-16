// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class emo
{

    public static final int a = 0x7877d8;
    public static boolean b = false;
    public static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static int e = -1;
    private static final Object f = new Object();
    private static String g = null;
    private static Integer h = null;

    public static int a(Context context)
    {
        byte byte0 = 9;
        if (!epx.a) goto _L2; else goto _L1
_L1:
        int i = 0;
_L12:
        return i;
_L2:
        Object obj;
        PackageManager packagemanager;
        Object obj1;
        packagemanager = context.getPackageManager();
        try
        {
            context.getResources().getString(g.ri);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ("com.google.android.gms".equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_265;
        }
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (g != null) goto _L4; else goto _L3
_L3:
        g = context.getPackageName();
        obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        h = Integer.valueOf(((Bundle) (obj1)).getInt("com.google.android.gms.version"));
_L7:
        obj1 = h;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_210;
_L6:
        h = null;
          goto _L7
        obj1;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", ((Throwable) (obj1)));
          goto _L7
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        if (g.equals(context.getPackageName())) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(g).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (((Integer) (obj1)).intValue() != a)
        {
            throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ")).append(a).append(" but found ").append(obj1).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        }
        try
        {
            obj = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1;
        }
        emq.a();
        if ((((PackageInfo) (obj)).versionCode % 1000) / 100 == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 && !erq.a(context)) goto _L10; else goto _L9
_L9:
        i = byte0;
        if (emq.a(((PackageInfo) (obj)), exe.a) == null) goto _L12; else goto _L11
_L11:
        i = a / 1000;
        if (((PackageInfo) (obj)).versionCode / 1000 < i)
        {
            (new StringBuilder("Google Play services out of date.  Requires ")).append(a).append(" but found ").append(((PackageInfo) (obj)).versionCode);
            return 2;
        }
        break MISSING_BLOCK_LABEL_453;
_L10:
        obj1 = emq.a(packagemanager.getPackageInfo("com.android.vending", 64), exe.a);
        i = byte0;
        if (obj1 == null) goto _L12; else goto _L13
_L13:
        obj1 = emq.a(((PackageInfo) (obj)), new erv[] {
            obj1
        });
        if (obj1 == null)
        {
            return 9;
        }
          goto _L11
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        i = byte0;
        if (!a(context, "com.android.vending")) goto _L12; else goto _L14
_L14:
        if (emq.a(((PackageInfo) (obj)), exe.a) == null)
        {
            return 9;
        }
          goto _L11
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                context.printStackTrace();
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static Dialog a(int i, Activity activity, int j)
    {
        return b(i, activity, null, j, null);
    }

    public static Intent a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return eqr.b("com.google.android.gms");

        case 42: // '*'
            return eqr.a();

        case 3: // '\003'
            return eqr.a("com.google.android.gms");
        }
    }

    public static void a(int i, Context context)
    {
        Object obj;
        PendingIntent pendingintent;
        Object obj2;
        Object obj3;
        int j;
label0:
        {
            pendingintent = null;
            j = i;
            if (erq.a(context))
            {
                j = i;
                if (i == 2)
                {
                    j = 42;
                }
            }
            if (!b(context, j))
            {
                boolean flag;
                if (j == 9)
                {
                    flag = a(context, "com.android.vending");
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            context = new emp(context);
            context.sendMessageDelayed(context.obtainMessage(1), 0x1d4c0L);
            return;
        }
        obj2 = context.getResources();
        obj3 = e(context);
        obj = context.getResources();
        j;
        JVM INSTR lookupswitch 15: default 232
    //                   1: 578
    //                   2: 611
    //                   3: 589
    //                   4: 573
    //                   5: 705
    //                   6: 573
    //                   7: 654
    //                   8: 675
    //                   9: 633
    //                   10: 690
    //                   11: 726
    //                   16: 741
    //                   17: 756
    //                   18: 600
    //                   42: 622;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(j).toString());
        obj = null;
_L27:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(g.rf);
        }
        obj = context.getResources();
        j;
        JVM INSTR lookupswitch 10: default 372
    //                   1: 777
    //                   2: 844
    //                   3: 884
    //                   5: 935
    //                   7: 924
    //                   9: 904
    //                   16: 946
    //                   17: 966
    //                   18: 824
    //                   42: 864;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L16:
        obj = ((Resources) (obj)).getString(g.ri);
_L28:
        obj3 = a(j);
        if (obj3 != null)
        {
            pendingintent = PendingIntent.getActivity(context, 0, ((Intent) (obj3)), 0x10000000);
        }
        if (erq.a(context))
        {
            g.a(g.k(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(g.qP).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(g.qO, ((Resources) (obj2)).getString(g.rq), pendingintent).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(g.rf);
            if (g.k(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(pendingintent).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (g.k(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (g.k(16))
                {
                    ((android.app.Notification.Builder) (obj1)).setStyle((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (obj))));
                    obj = ((android.app.Notification.Builder) (obj1)).build();
                } else
                {
                    obj = ((android.app.Notification.Builder) (obj1)).getNotification();
                }
                if (android.os.Build.VERSION.SDK_INT == 19)
                {
                    ((Notification) (obj)).extras.putBoolean("android.support.localOnly", true);
                }
            } else
            {
                obj2 = new Notification(0x108008a, ((CharSequence) (obj2)), System.currentTimeMillis());
                obj2.flags = ((Notification) (obj2)).flags | 0x10;
                ((Notification) (obj2)).setLatestEventInfo(context, ((CharSequence) (obj1)), ((CharSequence) (obj)), pendingintent);
                obj = obj2;
            }
        }
        switch (j)
        {
        default:
            i = 0;
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 18: // '\022'
        case 42: // '*'
            break MISSING_BLOCK_LABEL_1166;
        }
_L29:
        if (i != 0)
        {
            d.set(false);
            i = 10436;
        } else
        {
            i = 39789;
        }
        ((NotificationManager)context.getSystemService("notification")).notify(i, ((Notification) (obj)));
        return;
_L5:
        obj = null;
          goto _L27
_L2:
        obj = ((Resources) (obj)).getString(g.ra);
          goto _L27
_L4:
        obj = ((Resources) (obj)).getString(g.qW);
          goto _L27
_L14:
        obj = ((Resources) (obj)).getString(g.rp);
          goto _L27
_L3:
        obj = ((Resources) (obj)).getString(g.rn);
          goto _L27
_L15:
        obj = ((Resources) (obj)).getString(g.qS);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = ((Resources) (obj)).getString(g.rk);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = ((Resources) (obj)).getString(g.re);
          goto _L27
_L8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L6:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        obj = ((Resources) (obj)).getString(g.rc);
          goto _L27
_L11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        obj = null;
          goto _L27
_L12:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        obj = null;
          goto _L27
_L13:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        obj = ((Resources) (obj)).getString(g.rh);
          goto _L27
_L17:
        if (g.a(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(g.qZ, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(g.qY, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(g.ro, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(g.rm, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(g.qQ, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(g.qV, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(g.rj, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(g.rd);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(g.rb);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(g.qT, new Object[] {
            obj3
        });
          goto _L28
_L24:
        obj = ((Resources) (obj)).getString(g.rg);
          goto _L28
        i = 1;
          goto _L29
    }

    public static boolean a(int i, Activity activity)
    {
        return a(i, activity, 0, null);
    }

    public static boolean a(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(i, activity, null, j, oncancellistener);
    }

    public static boolean a(int i, Activity activity, ad ad, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ad = b(i, activity, ad, j, oncancellistener);
        if (ad == null)
        {
            return false;
        }
        if (activity instanceof ai)
        {
            activity = ((ai)activity).u_();
            emr.a(ad, oncancellistener).a(activity, "GooglePlayServicesErrorDialog");
        } else
        if (g.k(11))
        {
            activity = activity.getFragmentManager();
            emk emk1 = new emk();
            ad = (Dialog)g.b(ad, "Cannot display null dialog");
            ad.setOnCancelListener(null);
            ad.setOnDismissListener(null);
            emk1.a = ad;
            if (oncancellistener != null)
            {
                emk1.b = oncancellistener;
            }
            emk1.show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean a(Context context, int i)
    {
        if (a(context, i, "com.google.android.gms"))
        {
            context = context.getPackageManager();
            if (emq.a().a(context, "com.google.android.gms"))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!g.k(19))
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(i, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
            return flag;
        }
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        i = 0;
        do
        {
            flag = flag1;
            if (i >= context.length)
            {
                continue;
            }
            if (s.equals(context[i]))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_30;
_L1:
    }

    private static boolean a(Context context, String s)
    {
        if (g.k(21))
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_78;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)context.next()).getAppPackageName()));
            return true;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo(s, 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_78;
        context;
        return false;
    }

    public static boolean a(PackageManager packagemanager)
    {
label0:
        {
            if (!b(packagemanager))
            {
                boolean flag;
                if (b)
                {
                    flag = c;
                } else
                {
                    flag = "user".equals(Build.TYPE);
                }
                if (flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    private static Dialog b(int i, Activity activity, ad ad, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int k;
        obj1 = null;
        if (i == 0)
        {
            return null;
        }
        k = i;
        if (erq.a(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        if (!g.k(14)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
        if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId))) goto _L2; else goto _L3
_L3:
        obj = new android.app.AlertDialog.Builder(activity, 5);
_L21:
        android.app.AlertDialog.Builder builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(g.a(activity, k, e(activity)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(k);
        if (ad == null)
        {
            ad = new epy(activity, oncancellistener, j);
        } else
        {
            ad = new epy(ad, oncancellistener, j);
        }
        oncancellistener = g.d(activity, k);
        if (oncancellistener != null)
        {
            builder.setPositiveButton(oncancellistener, ad);
        }
        ad = activity.getResources();
        activity = obj1;
        k;
        JVM INSTR lookupswitch 15: default 328
    //                   1: 388
    //                   2: 421
    //                   3: 399
    //                   4: 356
    //                   5: 517
    //                   6: 356
    //                   7: 464
    //                   8: 485
    //                   9: 443
    //                   10: 501
    //                   11: 538
    //                   16: 554
    //                   17: 570
    //                   18: 410
    //                   42: 432;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L8 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L8:
        break; /* Loop/switch isn't completed */
_L4:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(k).toString());
        activity = obj1;
_L19:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        activity = ad.getString(g.ra);
        continue; /* Loop/switch isn't completed */
_L7:
        activity = ad.getString(g.qW);
        continue; /* Loop/switch isn't completed */
_L17:
        activity = ad.getString(g.rp);
        continue; /* Loop/switch isn't completed */
_L6:
        activity = ad.getString(g.rn);
        continue; /* Loop/switch isn't completed */
_L18:
        activity = ad.getString(g.qS);
        continue; /* Loop/switch isn't completed */
_L12:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = ad.getString(g.rk);
        continue; /* Loop/switch isn't completed */
_L10:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = ad.getString(g.re);
        continue; /* Loop/switch isn't completed */
_L11:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L13:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L9:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        activity = ad.getString(g.rc);
        continue; /* Loop/switch isn't completed */
_L14:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L15:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L16:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        activity = ad.getString(g.rh);
        if (true) goto _L19; else goto _L2
_L2:
        obj = null;
        if (true) goto _L21; else goto _L20
_L20:
    }

    static void b(int i, Context context)
    {
        Object obj;
        PendingIntent pendingintent;
        Object obj2;
        Object obj3;
        pendingintent = null;
        obj2 = context.getResources();
        obj3 = e(context);
        obj = context.getResources();
        i;
        JVM INSTR lookupswitch 15: default 152
    //                   1: 490
    //                   2: 523
    //                   3: 501
    //                   4: 485
    //                   5: 617
    //                   6: 485
    //                   7: 566
    //                   8: 587
    //                   9: 545
    //                   10: 602
    //                   11: 638
    //                   16: 653
    //                   17: 668
    //                   18: 512
    //                   42: 534;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(i).toString());
        obj = null;
_L27:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ((Resources) (obj2)).getString(g.rf);
        }
        obj = context.getResources();
        i;
        JVM INSTR lookupswitch 10: default 288
    //                   1: 689
    //                   2: 756
    //                   3: 796
    //                   5: 847
    //                   7: 836
    //                   9: 816
    //                   16: 858
    //                   17: 878
    //                   18: 736
    //                   42: 776;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L16:
        obj = ((Resources) (obj)).getString(g.ri);
_L28:
        obj3 = a(i);
        if (obj3 != null)
        {
            pendingintent = PendingIntent.getActivity(context, 0, ((Intent) (obj3)), 0x10000000);
        }
        if (erq.a(context))
        {
            g.a(g.k(16));
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(g.qP).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString())).addAction(g.qO, ((Resources) (obj2)).getString(g.rq), pendingintent).build();
        } else
        {
            obj2 = ((Resources) (obj2)).getString(g.rf);
            if (g.k(11))
            {
                obj1 = (new android.app.Notification.Builder(context)).setSmallIcon(0x108008a).setContentTitle(((CharSequence) (obj1))).setContentText(((CharSequence) (obj))).setContentIntent(pendingintent).setTicker(((CharSequence) (obj2))).setAutoCancel(true);
                if (g.k(20))
                {
                    ((android.app.Notification.Builder) (obj1)).setLocalOnly(true);
                }
                if (g.k(16))
                {
                    ((android.app.Notification.Builder) (obj1)).setStyle((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (obj))));
                    obj = ((android.app.Notification.Builder) (obj1)).build();
                } else
                {
                    obj = ((android.app.Notification.Builder) (obj1)).getNotification();
                }
                if (android.os.Build.VERSION.SDK_INT == 19)
                {
                    ((Notification) (obj)).extras.putBoolean("android.support.localOnly", true);
                }
            } else
            {
                obj2 = new Notification(0x108008a, ((CharSequence) (obj2)), System.currentTimeMillis());
                obj2.flags = ((Notification) (obj2)).flags | 0x10;
                ((Notification) (obj2)).setLatestEventInfo(context, ((CharSequence) (obj1)), ((CharSequence) (obj)), pendingintent);
                obj = obj2;
            }
        }
        switch (i)
        {
        default:
            i = 0;
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 18: // '\022'
        case 42: // '*'
            break MISSING_BLOCK_LABEL_1078;
        }
_L29:
        if (i != 0)
        {
            d.set(false);
            i = 10436;
        } else
        {
            i = 39789;
        }
        ((NotificationManager)context.getSystemService("notification")).notify(i, ((Notification) (obj)));
        return;
_L5:
        obj = null;
          goto _L27
_L2:
        obj = ((Resources) (obj)).getString(g.ra);
          goto _L27
_L4:
        obj = ((Resources) (obj)).getString(g.qW);
          goto _L27
_L14:
        obj = ((Resources) (obj)).getString(g.rp);
          goto _L27
_L3:
        obj = ((Resources) (obj)).getString(g.rn);
          goto _L27
_L15:
        obj = ((Resources) (obj)).getString(g.qS);
          goto _L27
_L9:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        obj = ((Resources) (obj)).getString(g.rk);
          goto _L27
_L7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        obj = ((Resources) (obj)).getString(g.re);
          goto _L27
_L8:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L10:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        obj = null;
          goto _L27
_L6:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        obj = ((Resources) (obj)).getString(g.rc);
          goto _L27
_L11:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        obj = null;
          goto _L27
_L12:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        obj = null;
          goto _L27
_L13:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        obj = ((Resources) (obj)).getString(g.rh);
          goto _L27
_L17:
        if (g.a(((Resources) (obj))))
        {
            obj = ((Resources) (obj)).getString(g.qZ, new Object[] {
                obj3
            });
        } else
        {
            obj = ((Resources) (obj)).getString(g.qY, new Object[] {
                obj3
            });
        }
          goto _L28
_L25:
        obj = ((Resources) (obj)).getString(g.ro, new Object[] {
            obj3
        });
          goto _L28
_L18:
        obj = ((Resources) (obj)).getString(g.rm, new Object[] {
            obj3
        });
          goto _L28
_L26:
        obj = ((Resources) (obj)).getString(g.qQ, new Object[] {
            obj3
        });
          goto _L28
_L19:
        obj = ((Resources) (obj)).getString(g.qV, new Object[] {
            obj3
        });
          goto _L28
_L22:
        obj = ((Resources) (obj)).getString(g.rj, new Object[] {
            obj3
        });
          goto _L28
_L21:
        obj = ((Resources) (obj)).getString(g.rd);
          goto _L28
_L20:
        obj = ((Resources) (obj)).getString(g.rb);
          goto _L28
_L23:
        obj = ((Resources) (obj)).getString(g.qT, new Object[] {
            obj3
        });
          goto _L28
_L24:
        obj = ((Resources) (obj)).getString(g.rg);
          goto _L28
        i = 1;
          goto _L29
    }

    public static void b(Context context)
    {
        int i = a(context);
        if (i != 0)
        {
            context = a(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
            if (context == null)
            {
                throw new emm(i);
            } else
            {
                throw new emn(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static boolean b(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
            return true;
        }
    }

    public static boolean b(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    private static boolean b(PackageManager packagemanager)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        int i = e;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        emq.a();
        if (emq.a(packagemanager, new erv[] {
            eru.b[1]
        }) == null) goto _L4; else goto _L3
_L3:
        e = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return e != 0;
_L4:
        e = 0;
          goto _L2
        packagemanager;
        e = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static void c(Context context)
    {
        if (d.getAndSet(true))
        {
            return;
        }
        try
        {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static Context d(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String e(Context context)
    {
        String s1 = context.getApplicationInfo().name;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = context.getPackageName();
            PackageManager packagemanager = context.getApplicationContext().getPackageManager();
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                s = packagemanager.getApplicationLabel(context).toString();
            }
        }
        return s;
    }

}
