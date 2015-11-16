// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class zk
{

    private SparseArray a;
    private SparseIntArray b;
    private int c;

    public zk()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }

    public zs a(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            zs zs1 = (zs)arraylist.get(i);
            arraylist.remove(i);
            return zs1;
        } else
        {
            return null;
        }
    }

    void a(yz yz, yz yz1, boolean flag)
    {
        if (yz != null)
        {
            c = c - 1;
        }
        if (!flag && c == 0)
        {
            a.clear();
        }
        if (yz1 != null)
        {
            c = c + 1;
        }
    }

    public void a(zs zs1)
    {
        int i = zs1.e;
        ArrayList arraylist1 = (ArrayList)a.get(i);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            ArrayList arraylist2 = new ArrayList();
            a.put(i, arraylist2);
            arraylist = arraylist2;
            if (b.indexOfKey(i) < 0)
            {
                b.put(i, 5);
                arraylist = arraylist2;
            }
        }
        if (b.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            zs1.t();
            arraylist.add(zs1);
            return;
        }
    }
}
