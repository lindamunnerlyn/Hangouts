// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class elv extends ad
    implements android.content.DialogInterface.OnCancelListener
{

    private boolean a;
    private boolean b;
    private int c;
    private ConnectionResult d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final SparseArray f = new SparseArray();

    public elv()
    {
        c = -1;
    }

    static int a(elv elv1, int i)
    {
        elv1.c = i;
        return i;
    }

    static ConnectionResult a(elv elv1, ConnectionResult connectionresult)
    {
        elv1.d = connectionresult;
        return connectionresult;
    }

    public static elv a(ai ai1)
    {
label0:
        {
            h.c("Must be called from main thread of process");
            ai1 = ai1.t_();
            elv elv1;
            try
            {
                elv1 = (elv)ai1.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (ai ai1)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", ai1);
            }
            if (elv1 != null)
            {
                ai1 = elv1;
                if (!elv1.isRemoving())
                {
                    break label0;
                }
            }
            ai1 = null;
        }
        return ai1;
    }

    private void a()
    {
        b = false;
        c = -1;
        d = null;
        for (int i = 0; i < f.size(); i++)
        {
            ((elw)f.valueAt(i)).b.b();
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Object obj = (elw)f.get(i);
        if (obj != null)
        {
            elw elw1 = (elw)f.get(i);
            f.remove(i);
            if (elw1 != null)
            {
                elw1.a();
            }
            obj = ((elw) (obj)).c;
            if (obj != null)
            {
                ((ekc) (obj)).a(connectionresult);
            }
        }
        a();
    }

    static void a(elv elv1, int i, ConnectionResult connectionresult)
    {
        elv1.a(i, connectionresult);
    }

    static boolean a(elv elv1)
    {
        return elv1.a;
    }

    public static elv b(ai ai1)
    {
        elv elv1 = a(ai1);
        ap ap1 = ai1.t_();
        ai1 = elv1;
        if (elv1 == null)
        {
            ai1 = new elv();
            ap1.a().a(ai1, "GmsSupportLifecycleFragment").c();
            ap1.b();
        }
        return ai1;
    }

    static boolean b(elv elv1)
    {
        return elv1.b;
    }

    static boolean c(elv elv1)
    {
        elv1.b = true;
        return true;
    }

    static void d(elv elv1)
    {
        elv1.a();
    }

    static Handler e(elv elv1)
    {
        return elv1.e;
    }

    public void a(int i, ejx ejx1, ekc ekc1)
    {
        h.a(ejx1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (f.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        ekc1 = new elw(this, i, ejx1, ekc1);
        f.put(i, ekc1);
        if (a && !b)
        {
            ejx1.b();
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < f.size(); i++)
        {
            ((elw)f.valueAt(i)).a(s, filedescriptor, printwriter, as);
        }

    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        i = 0;
_L5:
        if (i != 0)
        {
            a();
            return;
        } else
        {
            a(c, d);
            return;
        }
_L3:
        if (ejn.a(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a(c, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            c = bundle.getInt("failed_client_id", -1);
            if (c >= 0)
            {
                d = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", b);
        if (c >= 0)
        {
            bundle.putInt("failed_client_id", c);
            bundle.putInt("failed_status", d.c());
            bundle.putParcelable("failed_resolution", d.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        a = true;
        if (!b)
        {
            for (int i = 0; i < f.size(); i++)
            {
                ((elw)f.valueAt(i)).b.b();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < f.size(); i++)
        {
            ((elw)f.valueAt(i)).b.d();
        }

    }
}
