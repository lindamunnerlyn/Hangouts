// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.SystemClock;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

public final class cra extends gdy
{

    private final Activity a;
    private final String b;
    private final aoa c;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final long i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public cra(Activity activity, aoa aoa1, String s, boolean flag, int i1, int j1)
    {
        this(activity, aoa1, s, flag, i1, true, j1, 0, false, false, false);
    }

    public cra(Activity activity, aoa aoa1, String s, boolean flag, int i1, boolean flag1, int j1, 
            int k1, boolean flag2, boolean flag3, boolean flag4)
    {
        a = activity;
        c = aoa1;
        b = s;
        f = flag;
        e = i1;
        g = flag1;
        h = j1;
        i = SystemClock.elapsedRealtime();
        j = k1;
        k = flag2;
        l = flag3;
        m = flag4;
    }

    protected Object a()
    {
        return (ArrayList)(new aow(a, c.h())).J(b);
    }

    protected void onPostExecute(Object obj)
    {
        ArrayList arraylist;
        bph bph;
        byte byte0;
        arraylist = (ArrayList)obj;
        cgd cgd1;
        Iterator iterator;
        if (e == 1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        bph = (new bpj(c.a(), 1)).a(byte0).a("conversation").b(b).a();
        cgd1 = c.b();
        iterator = arraylist.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (cfz)iterator.next();
        if (!((cfz) (obj)).b.a(cgd1))
        {
            break MISSING_BLOCK_LABEL_67;
        }
_L4:
        arraylist.remove(obj);
        if (f)
        {
            if (arraylist.size() > 0)
            {
                obj = g.a(bph, arraylist, g, h, i, j, k, l, m);
            } else
            {
                Toast.makeText(a, a.getString(l.bH), 0).show();
                obj = null;
            }
        } else
        {
            boolean flag;
            boolean flag1;
            if (arraylist != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (byte0 == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = g.a(bph, null, null, flag, null, flag1, g, h, 2, i, j, k, l, m);
        }
        if (obj != null)
        {
            a.startActivity(((android.content.Intent) (obj)));
        }
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
