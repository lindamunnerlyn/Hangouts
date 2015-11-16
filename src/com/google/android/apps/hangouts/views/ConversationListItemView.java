// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aqs;
import eep;
import ego;
import egp;
import h;
import l;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            ConversationNameView, FadeImageView

public final class ConversationListItemView extends egp
    implements aqs
{

    private FadeImageView j;
    private ConversationNameView k;
    private TextView l;
    private ImageView m;
    private TextView n;
    private View o;
    private ImageView p;
    private View q;
    private View r;
    private View s;
    private ImageView t;
    private TextView u;

    public ConversationListItemView(Context context)
    {
        this(context, null);
    }

    public ConversationListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(int i1)
    {
        if (m.getVisibility() == 0)
        {
            i1 = 8;
        }
        l.setVisibility(i1);
    }

    public void a(int i1, int j1, int k1)
    {
        k.b(i1);
        k.a(k1);
        l.setTextColor(j1);
        l.setTypeface(null, k1);
        n.setTextColor(j1);
        n.setTypeface(null, k1);
    }

    protected void a(int i1, Cursor cursor)
    {
        boolean flag = false;
        if (c == i1) goto _L2; else goto _L1
_L1:
        int j1;
        c = i1;
        k();
        if (p())
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        g(j1);
        q.setVisibility(8);
        r.setVisibility(8);
        s.setVisibility(8);
        t.setVisibility(8);
        j1 = ((flag) ? 1 : 0);
        if (d == 1)
        {
            j1 = 1;
        }
        c;
        JVM INSTR tableswitch 1 5: default 124
    //                   1 138
    //                   2 210
    //                   3 124
    //                   4 124
    //                   5 240;
           goto _L2 _L3 _L4 _L2 _L2 _L5
_L2:
        super.a(i1, cursor);
        return;
_L3:
        ImageView imageview = p;
        Resources resources = getResources();
        int k1;
        if (j1 != 0)
        {
            k1 = l.at;
        } else
        {
            k1 = l.as;
        }
        imageview.setContentDescription(resources.getString(k1));
        imageview = p;
        if (j1 != 0)
        {
            j1 = com.google.android.apps.hangouts.R.drawable.bm;
        } else
        {
            j1 = com.google.android.apps.hangouts.R.drawable.bn;
        }
        imageview.setImageResource(j1);
        continue; /* Loop/switch isn't completed */
_L4:
        p.setContentDescription(getResources().getString(l.aq));
        p.setImageResource(com.google.android.apps.hangouts.R.drawable.bn);
        continue; /* Loop/switch isn't completed */
_L5:
        p.setContentDescription(getResources().getString(l.ar));
        p.setImageResource(com.google.android.apps.hangouts.R.drawable.bm);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a(Bitmap bitmap)
    {
        m.setImageBitmap(bitmap);
    }

    public void a(Drawable drawable)
    {
        if (eep.d())
        {
            l.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
            return;
        } else
        {
            l.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            return;
        }
    }

    public void a(CharSequence charsequence)
    {
        l.setText(charsequence);
    }

    public void a(boolean flag)
    {
        l.setSingleLine(flag);
    }

    public void a(boolean flag, Bitmap bitmap, boolean flag1, Object obj)
    {
        j.a(flag, bitmap);
    }

    public CharSequence b()
    {
        return k.getContentDescription();
    }

    public void b(int i1)
    {
        if (eep.d())
        {
            l.setCompoundDrawablesWithIntrinsicBounds(0, 0, i1, 0);
            return;
        } else
        {
            l.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
            return;
        }
    }

    public void b(Drawable drawable)
    {
        m.setImageDrawable(drawable);
    }

    public void b(CharSequence charsequence)
    {
        n.setText(charsequence);
    }

    public void b(String s1)
    {
        k.a(s1);
    }

    public CharSequence c()
    {
        return l.getText();
    }

    public void c(int i1)
    {
        l.setMaxLines(i1);
    }

    public void c(CharSequence charsequence)
    {
        n.setContentDescription(charsequence);
    }

    public TextView d()
    {
        return l;
    }

    public void d(int i1)
    {
        if (i1 == 0)
        {
            l.setVisibility(8);
        }
        m.setVisibility(i1);
    }

    public void d(CharSequence charsequence)
    {
        u.setText(charsequence);
    }

    public int e()
    {
        return n.getVisibility();
    }

    public void e(int i1)
    {
        m.getLayoutParams().height = i1;
    }

    public CharSequence f()
    {
        return n.getText();
    }

    public void f(int i1)
    {
        m.setAlpha(i1);
    }

    public CharSequence g()
    {
        return n.getContentDescription();
    }

    public void g(int i1)
    {
        n.setVisibility(i1);
    }

    public int h()
    {
        return q.getVisibility();
    }

    public void h(int i1)
    {
        o.setBackgroundColor(i1);
    }

    public int i()
    {
        return r.getVisibility();
    }

    public void i(int i1)
    {
        q.setVisibility(i1);
    }

    public int j()
    {
        return t.getVisibility();
    }

    public void j(int i1)
    {
        r.setVisibility(i1);
    }

    protected void k()
    {
        boolean flag = false;
        ImageView imageview;
        int i1;
        boolean flag1;
        if (n() || o())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        o.setVisibility(i1);
        imageview = p;
        if (flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
        p.setEnabled(flag1);
    }

    public void k(int i1)
    {
        s.setVisibility(i1);
    }

    public void l(int i1)
    {
        t.setVisibility(i1);
    }

    public boolean l()
    {
        return true;
    }

    public void m(int i1)
    {
        u.setVisibility(i1);
    }

    public void n(int i1)
    {
        p.setImageResource(i1);
    }

    public void onFinishInflate()
    {
        j = (FadeImageView)findViewById(h.F);
        k = (ConversationNameView)findViewById(h.aq);
        l = (TextView)findViewById(h.dE);
        m = (ImageView)findViewById(h.cH);
        n = (TextView)findViewById(h.gf);
        o = findViewById(h.aU);
        u = (TextView)findViewById(h.gE);
        p = (ImageView)findViewById(h.bI);
        p.setOnClickListener(new ego(this));
        q = findViewById(h.aw);
        r = findViewById(h.gy);
        s = findViewById(h.bp);
        t = (ImageView)findViewById(h.bH);
        super.onFinishInflate();
    }
}
