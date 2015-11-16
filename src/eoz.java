// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;

public final class eoz extends ad
    implements android.content.DialogInterface.OnCancelListener, br
{

    private boolean a;
    private int b;
    private ConnectionResult c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final SparseArray e = new SparseArray();

    public eoz()
    {
        b = -1;
    }

    public static eoz a(ai ai1)
    {
label0:
        {
            g.y("Must be called from main thread of process");
            ap ap1 = ai1.u_();
            eoz eoz1;
            try
            {
                eoz1 = (eoz)ap1.a("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (ai ai1)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", ai1);
            }
            if (eoz1 != null)
            {
                ai1 = eoz1;
                if (!eoz1.isRemoving())
                {
                    break label0;
                }
            }
            ai1 = new eoz();
            ap1.a().a(ai1, "GmsSupportLoaderLifecycleFragment").b();
            ap1.b();
        }
        return ai1;
    }

    private void a()
    {
        int i = 0;
        a = false;
        b = -1;
        c = null;
        bq bq1 = getLoaderManager();
        for (; i < e.size(); i++)
        {
            int j = e.keyAt(i);
            epa epa1 = b(j);
            if (epa1 != null && epa1.c())
            {
                bq1.a(j);
                bq1.a(j, null, this);
            }
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Object obj = (epb)e.get(i);
        if (obj != null)
        {
            e.remove(i);
            getLoaderManager().a(i);
            obj = ((epb) (obj)).b;
            if (obj != null)
            {
                ((end) (obj)).a(connectionresult);
            }
        }
        a();
    }

    static void a(eoz eoz1)
    {
        eoz1.a();
    }

    static void a(eoz eoz1, int i, ConnectionResult connectionresult)
    {
        eoz1.a(i, connectionresult);
    }

    private epa b(int i)
    {
        epa epa1;
        try
        {
            epa1 = (epa)getLoaderManager().b(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return epa1;
    }

    public emy a(int i)
    {
        if (getActivity() != null)
        {
            epa epa1 = b(i);
            if (epa1 != null)
            {
                return epa1.a;
            }
        }
        return null;
    }

    public void a(int i, emy emy, end end1)
    {
        g.b(emy, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        emy = new epb(emy, end1);
        e.put(i, emy);
        if (getActivity() != null)
        {
            bs.a = false;
            getLoaderManager().a(i, null, this);
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
            a(b, c);
            return;
        }
_L3:
        if (emo.a(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < e.size()) 
        {
            int j = e.keyAt(i);
            activity = b(j);
            if (activity != null && ((epb)e.valueAt(i)).a != ((epa) (activity)).a)
            {
                getLoaderManager().b(j, null, this);
            } else
            {
                getLoaderManager().a(j, null, this);
            }
            i++;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a(b, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a = bundle.getBoolean("resolving_error", false);
            b = bundle.getInt("failed_client_id", -1);
            if (b >= 0)
            {
                c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new epa(getActivity(), ((epb)e.get(i)).a);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        obj = (ConnectionResult)obj;
        if (!((ConnectionResult) (obj)).b())
        {
            int i = em1.o();
            if (!a)
            {
                a = true;
                b = i;
                c = ((ConnectionResult) (obj));
                d.post(new epc(this, i, ((ConnectionResult) (obj))));
            }
        }
    }

    public void onLoaderReset(em em1)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", a);
        if (b >= 0)
        {
            bundle.putInt("failed_client_id", b);
            bundle.putInt("failed_status", c.c());
            bundle.putParcelable("failed_resolution", c.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!a)
        {
            for (int i = 0; i < e.size(); i++)
            {
                getLoaderManager().a(e.keyAt(i), null, this);
            }

        }
    }
}
