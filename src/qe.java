// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

final class qe
{

    private CharSequence A;
    private CharSequence B;
    private CharSequence C;
    private ScrollView D;
    private int E;
    private Drawable F;
    private ImageView G;
    private TextView H;
    private TextView I;
    private View J;
    private int K;
    private int L;
    private int M;
    private final android.view.View.OnClickListener N = new qf(this);
    final rn a;
    ListView b;
    Button c;
    Message d;
    Button e;
    Message f;
    Button g;
    Message h;
    ListAdapter i;
    int j;
    int k;
    int l;
    int m;
    int n;
    Handler o;
    private final Context p;
    private final Window q;
    private CharSequence r;
    private CharSequence s;
    private View t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public qe(Context context, rn rn1, Window window)
    {
        z = false;
        E = 0;
        j = -1;
        M = 0;
        p = context;
        a = rn1;
        q = window;
        o = new ql(rn1);
        context = context.obtainStyledAttributes(null, ro.H, g.s, 0);
        K = context.getResourceId(ro.I, 0);
        L = context.getResourceId(ro.J, 0);
        k = context.getResourceId(ro.L, 0);
        l = context.getResourceId(ro.M, 0);
        m = context.getResourceId(ro.N, 0);
        n = context.getResourceId(ro.K, 0);
        context.recycle();
    }

    private static void a(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    private static boolean c(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i1 = view.getChildCount(); i1 > 0;)
        {
            int j1 = i1 - 1;
            i1 = j1;
            if (c(view.getChildAt(j1)))
            {
                return true;
            }
        }

        return false;
    }

    public void a()
    {
        boolean flag2 = false;
        a.a();
        Object obj;
        Object obj1;
        FrameLayout framelayout;
        int i1;
        boolean flag;
        if (L != 0 && M == 1)
        {
            i1 = L;
        } else
        {
            i1 = K;
        }
        a.setContentView(i1);
        obj = (ViewGroup)q.findViewById(g.aX);
        D = (ScrollView)q.findViewById(g.bg);
        D.setFocusable(false);
        I = (TextView)q.findViewById(0x102000b);
        if (I != null)
        {
            if (s != null)
            {
                I.setText(s);
            } else
            {
                I.setVisibility(8);
                D.removeView(I);
                if (b != null)
                {
                    obj = (ViewGroup)D.getParent();
                    i1 = ((ViewGroup) (obj)).indexOfChild(D);
                    ((ViewGroup) (obj)).removeViewAt(i1);
                    ((ViewGroup) (obj)).addView(b, i1, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else
                {
                    ((ViewGroup) (obj)).setVisibility(8);
                }
            }
        }
        c = (Button)q.findViewById(0x1020019);
        c.setOnClickListener(N);
        if (TextUtils.isEmpty(A))
        {
            c.setVisibility(8);
            i1 = 0;
        } else
        {
            c.setText(A);
            c.setVisibility(0);
            i1 = 1;
        }
        e = (Button)q.findViewById(0x102001a);
        e.setOnClickListener(N);
        if (TextUtils.isEmpty(B))
        {
            e.setVisibility(8);
        } else
        {
            e.setText(B);
            e.setVisibility(0);
            i1 |= 2;
        }
        g = (Button)q.findViewById(0x102001b);
        g.setOnClickListener(N);
        if (TextUtils.isEmpty(C))
        {
            g.setVisibility(8);
        } else
        {
            g.setText(C);
            g.setVisibility(0);
            i1 |= 4;
        }
        obj = p;
        obj1 = new TypedValue();
        ((Context) (obj)).getTheme().resolveAttribute(g.r, ((TypedValue) (obj1)), true);
        if (((TypedValue) (obj1)).data != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i1 == 1)
            {
                a(c);
            } else
            if (i1 == 2)
            {
                a(e);
            } else
            if (i1 == 4)
            {
                a(g);
            }
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = (ViewGroup)q.findViewById(g.bm);
        obj1 = vk.a(p, null, ro.H, g.s);
        if (J != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            ((ViewGroup) (obj)).addView(J, 0, layoutparams);
            q.findViewById(g.bl).setVisibility(8);
        } else
        {
            G = (ImageView)q.findViewById(0x1020006);
            boolean flag1;
            if (!TextUtils.isEmpty(r))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                H = (TextView)q.findViewById(g.aV);
                H.setText(r);
                if (E != 0)
                {
                    G.setImageResource(E);
                } else
                if (F != null)
                {
                    G.setImageDrawable(F);
                } else
                {
                    H.setPadding(G.getPaddingLeft(), G.getPaddingTop(), G.getPaddingRight(), G.getPaddingBottom());
                    G.setVisibility(8);
                }
            } else
            {
                q.findViewById(g.bl).setVisibility(8);
                G.setVisibility(8);
                ((ViewGroup) (obj)).setVisibility(8);
            }
        }
        obj = q.findViewById(g.aW);
        if (i1 == 0)
        {
            ((View) (obj)).setVisibility(8);
            obj = q.findViewById(g.bj);
            if (obj != null)
            {
                ((View) (obj)).setVisibility(0);
            }
        }
        framelayout = (FrameLayout)q.findViewById(g.aZ);
        if (t != null)
        {
            obj = t;
        } else
        if (u != 0)
        {
            obj = LayoutInflater.from(p).inflate(u, framelayout, false);
        } else
        {
            obj = null;
        }
        i1 = ((flag2) ? 1 : 0);
        if (obj != null)
        {
            i1 = 1;
        }
        if (i1 == 0 || !c(((View) (obj))))
        {
            q.setFlags(0x20000, 0x20000);
        }
        if (i1 != 0)
        {
            FrameLayout framelayout1 = (FrameLayout)q.findViewById(g.aY);
            framelayout1.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -1));
            if (z)
            {
                framelayout1.setPadding(v, w, x, y);
            }
            if (b != null)
            {
                ((android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams()).weight = 0.0F;
            }
        } else
        {
            framelayout.setVisibility(8);
        }
        obj = b;
        if (obj != null && i != null)
        {
            ((ListView) (obj)).setAdapter(i);
            i1 = j;
            if (i1 >= 0)
            {
                ((ListView) (obj)).setItemChecked(i1, true);
                ((ListView) (obj)).setSelection(i1);
            }
        }
        ((vk) (obj1)).b();
    }

    public void a(int i1)
    {
        t = null;
        u = i1;
        z = false;
    }

    public void a(int i1, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        if (onclicklistener != null)
        {
            message = o.obtainMessage(i1, onclicklistener);
        }
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            A = charsequence;
            d = message;
            return;

        case -2: 
            B = charsequence;
            f = message;
            return;

        case -3: 
            C = charsequence;
            h = message;
            return;
        }
    }

    public void a(Drawable drawable)
    {
label0:
        {
            F = drawable;
            E = 0;
            if (G != null)
            {
                if (drawable == null)
                {
                    break label0;
                }
                G.setImageDrawable(drawable);
            }
            return;
        }
        G.setVisibility(8);
    }

    public void a(View view)
    {
        J = view;
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        t = view;
        u = 0;
        z = true;
        v = i1;
        w = j1;
        x = k1;
        y = l1;
    }

    public void a(CharSequence charsequence)
    {
        r = charsequence;
        if (H != null)
        {
            H.setText(charsequence);
        }
    }

    public boolean a(KeyEvent keyevent)
    {
        return D != null && D.executeKeyEvent(keyevent);
    }

    public void b(int i1)
    {
label0:
        {
            F = null;
            E = i1;
            if (G != null)
            {
                if (i1 == 0)
                {
                    break label0;
                }
                G.setImageResource(E);
            }
            return;
        }
        G.setVisibility(8);
    }

    public void b(View view)
    {
        t = view;
        u = 0;
        z = false;
    }

    public void b(CharSequence charsequence)
    {
        s = charsequence;
        if (I != null)
        {
            I.setText(charsequence);
        }
    }

    public boolean b(KeyEvent keyevent)
    {
        return D != null && D.executeKeyEvent(keyevent);
    }

    public int c(int i1)
    {
        TypedValue typedvalue = new TypedValue();
        p.getTheme().resolveAttribute(i1, typedvalue, true);
        return typedvalue.resourceId;
    }
}
