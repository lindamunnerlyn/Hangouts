// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

public class bb extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private ap d;
    private int e;
    private android.widget.TabHost.OnTabChangeListener f;
    private bf g;
    private boolean h;

    public bb(Context context)
    {
        super(context, null);
        a = new ArrayList();
        a(context, ((AttributeSet) (null)));
    }

    public bb(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        a(context, attributeset);
    }

    private bg a(String s, bg bg1)
    {
        bf bf1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            bf bf2 = (bf)a.get(i);
            if (bf2.a.equals(s))
            {
                bf1 = bf2;
            }
        }

        if (bf1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = bg1;
        if (g != bf1)
        {
            s = bg1;
            if (bg1 == null)
            {
                s = d.a();
            }
            if (g != null && g.d != null)
            {
                s.d(g.d);
            }
            if (bf1 != null)
            {
                if (bf1.d == null)
                {
                    bf1.d = ad.instantiate(c, bf1.b.getName(), bf1.c);
                    s.a(e, bf1.d, bf1.a);
                } else
                {
                    s.e(bf1.d);
                }
            }
            g = bf1;
        }
        return s;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        e = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    public void a(Context context, ap ap1, int i)
    {
        if (findViewById(0x1020013) == null)
        {
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            addView(linearlayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            Object obj = new TabWidget(context);
            ((TabWidget) (obj)).setId(0x1020013);
            ((TabWidget) (obj)).setOrientation(0);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
            obj = new FrameLayout(context);
            ((FrameLayout) (obj)).setId(0x1020011);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F));
            obj = new FrameLayout(context);
            b = ((FrameLayout) (obj));
            b.setId(e);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
        }
        super.setup();
        c = context;
        d = ap1;
        e = i;
        if (b == null)
        {
            b = (FrameLayout)findViewById(e);
            if (b == null)
            {
                throw new IllegalStateException((new StringBuilder("No tab content FrameLayout found for id ")).append(e).toString());
            }
        }
        b.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }

    public void a(android.widget.TabHost.TabSpec tabspec, Class class1)
    {
        tabspec.setContent(new bc(c));
        String s = tabspec.getTag();
        class1 = new bf(s, class1, null);
        if (h)
        {
            class1.d = d.a(s);
            if (((bf) (class1)).d != null && !((bf) (class1)).d.isDetached())
            {
                bg bg1 = d.a();
                bg1.d(((bf) (class1)).d);
                bg1.b();
            }
        }
        a.add(class1);
        addTab(tabspec);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        bg bg1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            bf bf1 = (bf)a.get(i);
            bf1.d = d.a(bf1.a);
            bg bg2 = bg1;
            if (bf1.d != null)
            {
                bg2 = bg1;
                if (!bf1.d.isDetached())
                {
                    if (bf1.a.equals(s))
                    {
                        g = bf1;
                        bg2 = bg1;
                    } else
                    {
                        bg2 = bg1;
                        if (bg1 == null)
                        {
                            bg2 = d.a();
                        }
                        bg2.d(bf1.d);
                    }
                }
            }
            i++;
            bg1 = bg2;
        }
        h = true;
        bg1 = a(s, bg1);
        if (bg1 != null)
        {
            bg1.b();
            d.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (bd)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((bd) (parcelable)).a);
    }

    public Parcelable onSaveInstanceState()
    {
        bd bd1 = new bd(super.onSaveInstanceState());
        bd1.a = getCurrentTabTag();
        return bd1;
    }

    public void onTabChanged(String s)
    {
        if (h)
        {
            bg bg1 = a(s, ((bg) (null)));
            if (bg1 != null)
            {
                bg1.b();
            }
        }
        if (f != null)
        {
            f.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        f = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
