// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public final class qg
{

    public int A;
    public boolean B;
    public boolean C[];
    public boolean D;
    public boolean E;
    public int F;
    public android.content.DialogInterface.OnMultiChoiceClickListener G;
    public Cursor H;
    public String I;
    public String J;
    public android.widget.AdapterView.OnItemSelectedListener K;
    public boolean L;
    public final Context a;
    public final LayoutInflater b;
    public int c;
    public Drawable d;
    public int e;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public android.content.DialogInterface.OnClickListener j;
    public CharSequence k;
    public android.content.DialogInterface.OnClickListener l;
    public CharSequence m;
    public android.content.DialogInterface.OnClickListener n;
    public boolean o;
    public android.content.DialogInterface.OnCancelListener p;
    public android.content.DialogInterface.OnDismissListener q;
    public android.content.DialogInterface.OnKeyListener r;
    public CharSequence s[];
    public ListAdapter t;
    public android.content.DialogInterface.OnClickListener u;
    public int v;
    public View w;
    public int x;
    public int y;
    public int z;

    public qg(Context context)
    {
        c = 0;
        e = 0;
        B = false;
        F = -1;
        L = true;
        a = context;
        o = true;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void a(qe qe1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        qe1.a(g);
_L10:
        if (h != null)
        {
            qe1.b(h);
        }
        if (i != null)
        {
            qe1.a(-1, i, j, null);
        }
        if (k != null)
        {
            qe1.a(-2, k, l, null);
        }
        if (m != null)
        {
            qe1.a(-3, m, n, null);
        }
        if (s != null || H != null || t != null)
        {
            ListView listview = (ListView)b.inflate(qe1.k, null);
            Object obj;
            if (D)
            {
                if (H == null)
                {
                    obj = new qh(this, a, qe1.l, s, listview);
                } else
                {
                    obj = new qi(this, a, H, listview, qe1);
                }
            } else
            {
                int i1;
                if (E)
                {
                    i1 = qe1.m;
                } else
                {
                    i1 = qe1.n;
                }
                if (H == null)
                {
                    if (t != null)
                    {
                        obj = t;
                    } else
                    {
                        obj = new qm(a, i1, s);
                    }
                } else
                {
                    obj = new SimpleCursorAdapter(a, i1, H, new String[] {
                        I
                    }, new int[] {
                        0x1020014
                    });
                }
            }
            qe1.i = ((ListAdapter) (obj));
            qe1.j = F;
            if (u != null)
            {
                listview.setOnItemClickListener(new qj(this, qe1));
            } else
            if (G != null)
            {
                listview.setOnItemClickListener(new qk(this, listview, qe1));
            }
            if (K != null)
            {
                listview.setOnItemSelectedListener(K);
            }
            if (E)
            {
                listview.setChoiceMode(1);
            } else
            if (D)
            {
                listview.setChoiceMode(2);
            }
            qe1.b = listview;
        }
        if (w == null) goto _L4; else goto _L3
_L3:
        if (!B) goto _L6; else goto _L5
_L5:
        qe1.a(w, x, y, z, A);
_L8:
        return;
_L2:
        if (f != null)
        {
            qe1.a(f);
        }
        if (d != null)
        {
            qe1.a(d);
        }
        if (c != 0)
        {
            qe1.b(c);
        }
        if (e != 0)
        {
            qe1.b(qe1.c(e));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        qe1.b(w);
        return;
_L4:
        if (v == 0) goto _L8; else goto _L7
_L7:
        qe1.a(v);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
