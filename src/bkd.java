// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;

final class bkd
    implements android.widget.AdapterView.OnItemClickListener
{

    final bkb a;
    private final int b;
    private final SparseArray c;

    public bkd(bkb bkb1, int i)
    {
        a = bkb1;
        super();
        b = i;
        if (b == 0 || b == 4 || b == 5)
        {
            c = new SparseArray();
        } else
        {
            c = null;
        }
        if (b == 0 || b == 4)
        {
            c.put(0xfe4e5, new Pair(Integer.valueOf(0x1f1ef), Integer.valueOf(0x1f1f5)));
            c.put(0xfe4e6, new Pair(Integer.valueOf(0x1f1fa), Integer.valueOf(0x1f1f8)));
            c.put(0xfe4e7, new Pair(Integer.valueOf(0x1f1eb), Integer.valueOf(0x1f1f7)));
            c.put(0xfe4e8, new Pair(Integer.valueOf(0x1f1e9), Integer.valueOf(0x1f1ea)));
            c.put(0xfe4e9, new Pair(Integer.valueOf(0x1f1ee), Integer.valueOf(0x1f1f9)));
            c.put(0xfe4ea, new Pair(Integer.valueOf(0x1f1ec), Integer.valueOf(0x1f1e7)));
            c.put(0xfe4eb, new Pair(Integer.valueOf(0x1f1ea), Integer.valueOf(0x1f1f8)));
            c.put(0xfe4ec, new Pair(Integer.valueOf(0x1f1f7), Integer.valueOf(0x1f1fa)));
            c.put(0xfe4ed, new Pair(Integer.valueOf(0x1f1e8), Integer.valueOf(0x1f1f3)));
            c.put(0xfe4ee, new Pair(Integer.valueOf(0x1f1f0), Integer.valueOf(0x1f1f7)));
        }
        if (b == 0 || b == 5)
        {
            c.put(0xfe82e, new Pair(Integer.valueOf(49), Integer.valueOf(8419)));
            c.put(0xfe82f, new Pair(Integer.valueOf(50), Integer.valueOf(8419)));
            c.put(0xfe830, new Pair(Integer.valueOf(51), Integer.valueOf(8419)));
            c.put(0xfe831, new Pair(Integer.valueOf(52), Integer.valueOf(8419)));
            c.put(0xfe832, new Pair(Integer.valueOf(53), Integer.valueOf(8419)));
            c.put(0xfe833, new Pair(Integer.valueOf(54), Integer.valueOf(8419)));
            c.put(0xfe834, new Pair(Integer.valueOf(55), Integer.valueOf(8419)));
            c.put(0xfe835, new Pair(Integer.valueOf(56), Integer.valueOf(8419)));
            c.put(0xfe836, new Pair(Integer.valueOf(57), Integer.valueOf(8419)));
            c.put(0xfe837, new Pair(Integer.valueOf(48), Integer.valueOf(8419)));
            c.put(0xfe82c, new Pair(Integer.valueOf(35), Integer.valueOf(8419)));
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i = (int)l;
        if (b > 0)
        {
            bkb.b(a).a(i);
        }
        adapterview = new StringBuilder();
        if (c != null)
        {
            view = (Pair)c.get(i);
            if (view != null)
            {
                adapterview.appendCodePoint(g.a((Integer)((Pair) (view)).first, 0));
                i = g.a((Integer)((Pair) (view)).second, 0);
            }
        }
        adapterview.appendCodePoint(i);
        bkb.d(a).a(adapterview);
    }
}
