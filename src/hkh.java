// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class hkh
{

    private Activity a;
    private hjy b;
    private Context c;
    private long d;
    private int e;
    private SharedPreferences f;
    private android.content.SharedPreferences.Editor g;
    private boolean h;
    private String i;
    private int j;
    private PreferenceScreen k;
    private List l;
    private List m;
    private List n;
    private List o;
    private hkk p;

    public hkh(Activity activity)
    {
        d = 0L;
        a = activity;
        e = 100;
        c = activity;
        i = c(activity);
        f = null;
    }

    public static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences(c(context), 0);
    }

    private static String c(Context context)
    {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (o != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ArrayList arraylist;
        arraylist = new ArrayList(o);
        o.clear();
        this;
        JVM INSTR monitorexit ;
        for (int i1 = arraylist.size() - 1; i1 >= 0; i1--)
        {
            ((DialogInterface)arraylist.get(i1)).dismiss();
        }

        break MISSING_BLOCK_LABEL_71;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PreferenceScreen a(Context context)
    {
        context = new PreferenceScreen(context, null);
        context.a(this);
        return context;
    }

    public hjr a(CharSequence charsequence)
    {
        if (k == null)
        {
            return null;
        } else
        {
            return k.a(charsequence);
        }
    }

    hjy a()
    {
        return b;
    }

    void a(int i1, int j1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ArrayList arraylist = new ArrayList(l);
        this;
        JVM INSTR monitorexit ;
        int l1 = arraylist.size();
        for (int k1 = 0; k1 < l1 && !((hkj)arraylist.get(k1)).a(i1, j1, intent); k1++) { }
        break MISSING_BLOCK_LABEL_83;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void a(DialogInterface dialoginterface)
    {
        this;
        JVM INSTR monitorenter ;
        if (o == null)
        {
            o = new ArrayList();
        }
        o.add(dialoginterface);
        this;
        JVM INSTR monitorexit ;
        return;
        dialoginterface;
        this;
        JVM INSTR monitorexit ;
        throw dialoginterface;
    }

    void a(hjy hjy)
    {
        b = hjy;
    }

    void a(hki hki1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n == null)
        {
            n = new ArrayList();
        }
        if (!n.contains(hki1))
        {
            n.add(hki1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        hki1;
        this;
        JVM INSTR monitorexit ;
        throw hki1;
    }

    public void a(hkj hkj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = new ArrayList();
        }
        if (!l.contains(hkj1))
        {
            l.add(hkj1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        hkj1;
        this;
        JVM INSTR monitorexit ;
        throw hkj1;
    }

    void a(hkk hkk)
    {
        p = hkk;
    }

    boolean a(PreferenceScreen preferencescreen)
    {
        if (preferencescreen != k)
        {
            k = preferencescreen;
            return true;
        } else
        {
            return false;
        }
    }

    long b()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = d;
        d = 1L + l1;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(DialogInterface dialoginterface)
    {
        this;
        JVM INSTR monitorenter ;
        if (o != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        o.remove(dialoginterface);
        this;
        JVM INSTR monitorexit ;
        return;
        dialoginterface;
        this;
        JVM INSTR monitorexit ;
        throw dialoginterface;
    }

    void b(hki hki1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null)
        {
            n.remove(hki1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        hki1;
        this;
        JVM INSTR monitorexit ;
        throw hki1;
    }

    public SharedPreferences c()
    {
        if (f == null)
        {
            f = c.getSharedPreferences(i, j);
        }
        return f;
    }

    PreferenceScreen d()
    {
        return k;
    }

    android.content.SharedPreferences.Editor e()
    {
        if (h)
        {
            if (g == null)
            {
                g = c().edit();
            }
            return g;
        } else
        {
            return c().edit();
        }
    }

    boolean f()
    {
        return !h;
    }

    Activity g()
    {
        return a;
    }

    void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ArrayList arraylist = new ArrayList(m);
        this;
        JVM INSTR monitorexit ;
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            arraylist.get(i1);
        }

        break MISSING_BLOCK_LABEL_60;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void i()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = new ArrayList(n);
_L1:
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            int j1 = ((List) (obj)).size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((hki)((List) (obj)).get(i1)).d();
            }

        }
        break MISSING_BLOCK_LABEL_68;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        l();
        return;
        obj = null;
          goto _L1
    }

    int j()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = e;
        e = i1 + 1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    hkk k()
    {
        return p;
    }
}
