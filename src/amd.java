// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentServiceImpl;

public final class amd
    implements alw
{

    private static final String a = Integer.toString(Process.myPid());
    private static final boolean b = false;
    private static final efh c = efh.a("concurrent");
    private final Context d;

    public amd(Context context)
    {
        d = context;
    }

    public alt a(alx alx)
    {
        Object obj;
        String s;
        Parcelable parcelable;
        Bundle bundle;
        if (alx instanceof alv)
        {
            obj = ((alv)alx).a();
        } else
        {
            obj = "";
        }
        s = alx.getClass().getName();
        parcelable = (Parcelable)alx;
        bundle = new Bundle();
        if (parcelable != null)
        {
            bundle.putParcelable("concurrent_bundle_util_key", parcelable);
        }
        obj = new alz(s, ((String) (obj)), bundle, 0);
        if (b && ((alz) (obj)).a(alx.getClass()) == null)
        {
            alx = String.valueOf(alx.getClass().getName());
            Intent intent;
            efh efh1;
            String s1;
            if (alx.length() != 0)
            {
                "Checking task state failed - incorrect Parcelable probably for ".concat(alx);
            } else
            {
                new String("Checking task state failed - incorrect Parcelable probably for ");
            }
        }
        intent = new Intent(d, com/google/android/apps/hangouts/concurrent/impl/ConcurrentServiceImpl);
        intent.putExtra("concurrent_service_command_key", amc.b - 1);
        intent.putExtra("concurrent_process_data_key", ((Parcelable) (obj)));
        intent.putExtra("concurrent_calling_pid_key", a);
        intent.putExtra("concurrent_calling_origin_stack_key", Log.getStackTraceString(new Throwable()));
        efh1 = c;
        alx = String.valueOf("SCHEDULE_");
        s1 = String.valueOf(((alz) (obj)).a());
        if (s1.length() != 0)
        {
            alx = alx.concat(s1);
        } else
        {
            alx = new String(alx);
        }
        efh1.b(alx);
        d.startService(intent);
        return ((alz) (obj)).c;
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
