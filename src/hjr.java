// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class hjr
    implements Comparable
{

    private boolean A;
    private List B;
    private boolean C;
    private Context a;
    hju b;
    private hkh c;
    private long d;
    private hjv e;
    private hjw f;
    private int g;
    private CharSequence h;
    private int i;
    private CharSequence j;
    private int k;
    private Drawable l;
    private String m;
    private Intent n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private Object u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public hjr(Context context)
    {
        this(context, null);
    }

    public hjr(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.tM);
    }

    public hjr(Context context, AttributeSet attributeset, int i1)
    {
        g = 0x7fffffff;
        p = true;
        q = true;
        s = true;
        v = true;
        w = true;
        x = true;
        y = g.tP;
        A = true;
        a = context;
        context = context.obtainStyledAttributes(attributeset, hkr.ad, i1, 0);
        i1 = context.getIndexCount();
        while (i1 >= 0) 
        {
            int j1 = context.getIndex(i1);
            if (j1 == hkr.ai)
            {
                k = context.getResourceId(j1, 0);
            } else
            if (j1 == hkr.aj)
            {
                m = context.getString(j1);
            } else
            if (j1 == hkr.aq)
            {
                i = context.getResourceId(j1, 0);
                h = context.getString(j1);
            } else
            if (j1 == hkr.ap)
            {
                j = context.getString(j1);
            } else
            if (j1 == hkr.al)
            {
                g = context.getInt(j1, g);
            } else
            if (j1 == hkr.ah)
            {
                o = context.getString(j1);
            } else
            if (j1 == hkr.ak)
            {
                y = context.getResourceId(j1, y);
            } else
            if (j1 == hkr.ar)
            {
                z = context.getResourceId(j1, z);
            } else
            if (j1 == hkr.ag)
            {
                p = context.getBoolean(j1, true);
            } else
            if (j1 == hkr.an)
            {
                q = context.getBoolean(j1, true);
            } else
            if (j1 == hkr.am)
            {
                s = context.getBoolean(j1, s);
            } else
            if (j1 == hkr.af)
            {
                t = context.getString(j1);
            } else
            if (j1 == hkr.ae)
            {
                u = a(context, j1);
            } else
            if (j1 == hkr.ao)
            {
                x = context.getBoolean(j1, x);
            }
            i1--;
        }
        context.recycle();
        if (!getClass().getName().startsWith("com.google"))
        {
            A = false;
        }
    }

    private void a(android.content.SharedPreferences.Editor editor)
    {
        if (!c.f())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        editor.apply();
        return;
        AbstractMethodError abstractmethoderror;
        abstractmethoderror;
        editor.commit();
        return;
    }

    private void a(View view, boolean flag)
    {
        view.setEnabled(flag);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i1 = view.getChildCount() - 1; i1 >= 0; i1--)
            {
                a(view.getChildAt(i1), flag);
            }

        }
    }

    private void c()
    {
        if (TextUtils.isEmpty(t))
        {
            return;
        }
        hjr hjr1 = d(t);
        if (hjr1 != null)
        {
            if (hjr1.B == null)
            {
                hjr1.B = new ArrayList();
            }
            hjr1.B.add(this);
            f(hjr1.D());
            return;
        } else
        {
            String s1 = t;
            String s2 = m;
            String s3 = String.valueOf(h);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 52 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Dependency \"").append(s1).append("\" not found for preference \"").append(s2).append("\" (title: \"").append(s3).append("\"").toString());
        }
    }

    private void d()
    {
        if (t != null)
        {
            hjr hjr1 = d(t);
            if (hjr1 != null && hjr1.B != null)
            {
                hjr1.B.remove(this);
            }
        }
    }

    protected void A()
    {
        if (b != null)
        {
            b.b();
        }
    }

    public hkh B()
    {
        return c;
    }

    public boolean B_()
    {
        return p && v && w;
    }

    protected void C()
    {
        c();
    }

    public boolean D()
    {
        return !B_();
    }

    protected void E()
    {
        d();
    }

    boolean F()
    {
        return A;
    }

    StringBuilder G()
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharSequence charsequence = o();
        if (!TextUtils.isEmpty(charsequence))
        {
            stringbuilder.append(charsequence).append(' ');
        }
        charsequence = g();
        if (!TextUtils.isEmpty(charsequence))
        {
            stringbuilder.append(charsequence).append(' ');
        }
        if (stringbuilder.length() > 0)
        {
            stringbuilder.setLength(stringbuilder.length() - 1);
        }
        return stringbuilder;
    }

    public int a(hjr hjr1)
    {
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        if (g == hjr1.g) goto _L2; else goto _L1
_L1:
        i1 = g - hjr1.g;
_L4:
        return i1;
_L2:
        int i2;
        int j2;
        if (h != hjr1.h)
        {
            if (h == null)
            {
                return 1;
            }
            if (hjr1.h == null)
            {
                return -1;
            }
            i2 = h.length();
            j2 = hjr1.h.length();
            int k2 = Math.min(i2, j2);
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= k2)
                    {
                        break label1;
                    }
                    int l1 = Character.toLowerCase(h.charAt(j1)) - Character.toLowerCase(hjr1.h.charAt(k1));
                    i1 = l1;
                    if (l1 != 0)
                    {
                        break label0;
                    }
                    k1++;
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return i2 - j2;
    }

    public View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        a(view1);
        return view1;
    }

    public View a(ViewGroup viewgroup)
    {
        ViewGroup viewgroup1;
label0:
        {
            LayoutInflater layoutinflater = (LayoutInflater)a.getSystemService("layout_inflater");
            viewgroup = layoutinflater.inflate(y, viewgroup, false);
            viewgroup1 = (ViewGroup)viewgroup.findViewById(o.m);
            if (viewgroup1 != null)
            {
                if (z == 0)
                {
                    break label0;
                }
                layoutinflater.inflate(z, viewgroup1);
            }
            return viewgroup;
        }
        viewgroup1.setVisibility(8);
        return viewgroup;
    }

    protected Object a(TypedArray typedarray, int i1)
    {
        return null;
    }

    public void a(Intent intent)
    {
        n = intent;
    }

    public void a(Parcelable parcelable)
    {
        C = true;
        if (parcelable != hjs.EMPTY_STATE && parcelable != null)
        {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        } else
        {
            return;
        }
    }

    public void a(View view)
    {
        int i1 = 0;
        Object obj = (TextView)view.findViewById(o.l);
        if (obj != null)
        {
            CharSequence charsequence = o();
            if (!TextUtils.isEmpty(charsequence))
            {
                ((TextView) (obj)).setText(charsequence);
                ((TextView) (obj)).setVisibility(0);
                if (p() && !B_())
                {
                    ((TextView) (obj)).setTextColor(x().getResources().getColor(g.tO));
                }
            } else
            {
                ((TextView) (obj)).setVisibility(8);
            }
        }
        obj = (TextView)view.findViewById(o.k);
        if (obj != null)
        {
            charsequence = g();
            if (!TextUtils.isEmpty(charsequence))
            {
                ((TextView) (obj)).setText(charsequence);
                ((TextView) (obj)).setVisibility(0);
                if (p() && !B_())
                {
                    ((TextView) (obj)).setTextColor(x().getResources().getColor(g.tO));
                }
            } else
            {
                ((TextView) (obj)).setVisibility(8);
            }
        }
        obj = (ImageView)view.findViewById(o.f);
        if (obj != null)
        {
            if (k != 0 || l != null)
            {
                if (l == null)
                {
                    l = x().getResources().getDrawable(k);
                }
                if (l != null)
                {
                    ((ImageView) (obj)).setImageDrawable(l);
                }
            }
            if (l == null)
            {
                i1 = 8;
            }
            ((ImageView) (obj)).setVisibility(i1);
        }
        if (x)
        {
            a(view, B_());
        }
    }

    public void a(PreferenceScreen preferencescreen)
    {
        if (B_()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        z_();
        if (f != null)
        {
            f.a();
            return;
        }
        obj = B();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((hkh) (obj)).k();
        if (preferencescreen != null && obj != null && ((hkk) (obj)).a(this)) goto _L1; else goto _L3
_L3:
        if (n == null) goto _L1; else goto _L4
_L4:
        x().startActivity(n);
        return;
    }

    public void a(hjv hjv1)
    {
        e = hjv1;
    }

    public void a(hjw hjw1)
    {
        f = hjw1;
    }

    protected void a(hkh hkh1)
    {
        c = hkh1;
        d = hkh1.b();
        if (!v() || !y().contains(m))
        {
            if (u != null)
            {
                a(false, u);
            }
            return;
        } else
        {
            a(true, null);
            return;
        }
    }

    protected void a(boolean flag, Object obj)
    {
    }

    protected boolean a(Object obj)
    {
        return e == null || e.a(this, obj);
    }

    public void b(Bundle bundle)
    {
        c(bundle);
    }

    public void b(CharSequence charsequence)
    {
        if (charsequence == null && j != null || charsequence != null && !charsequence.equals(j))
        {
            j = charsequence;
            z();
        }
    }

    public void b(Object obj)
    {
        u = obj;
    }

    protected boolean b(boolean flag)
    {
        boolean flag1 = false;
        if (v())
        {
            if (!flag)
            {
                flag1 = true;
            }
            if (flag == c(flag1))
            {
                return true;
            } else
            {
                android.content.SharedPreferences.Editor editor = c.e();
                editor.putBoolean(m, flag);
                a(editor);
                return true;
            }
        } else
        {
            return false;
        }
    }

    void c(Bundle bundle)
    {
        if (t())
        {
            C = false;
            Parcelable parcelable = e();
            if (!C)
            {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelable != null)
            {
                bundle.putParcelable(m, parcelable);
            }
        }
    }

    public void c(CharSequence charsequence)
    {
        if (charsequence == null && h != null || charsequence != null && !charsequence.equals(h))
        {
            i = 0;
            h = charsequence;
            z();
        }
    }

    public void c(String s1)
    {
        m = s1;
        if (r && !t())
        {
            s();
        }
    }

    protected boolean c(boolean flag)
    {
        if (!v())
        {
            return flag;
        } else
        {
            return c.c().getBoolean(m, flag);
        }
    }

    public int compareTo(Object obj)
    {
        return a((hjr)obj);
    }

    protected hjr d(String s1)
    {
        if (TextUtils.isEmpty(s1) || c == null)
        {
            return null;
        } else
        {
            return c.a(s1);
        }
    }

    public void d(int i1)
    {
        if (i1 != y)
        {
            A = false;
        }
        y = i1;
    }

    public void d(Bundle bundle)
    {
        e(bundle);
    }

    public void d(boolean flag)
    {
        if (p != flag)
        {
            p = flag;
            e(D());
            z();
        }
    }

    public Parcelable e()
    {
        C = true;
        return hjs.EMPTY_STATE;
    }

    public void e(int i1)
    {
        if (i1 != z)
        {
            A = false;
        }
        z = i1;
    }

    void e(Bundle bundle)
    {
        if (t())
        {
            bundle = bundle.getParcelable(m);
            if (bundle != null)
            {
                C = false;
                a(bundle);
                if (!C)
                {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    public void e(String s1)
    {
        d();
        t = s1;
        c();
    }

    public void e(boolean flag)
    {
        List list = B;
        if (list != null)
        {
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((hjr)list.get(i1)).f(flag);
                i1++;
            }
        }
    }

    public void f(int i1)
    {
        if (i1 != g)
        {
            g = i1;
            A();
        }
    }

    public void f(boolean flag)
    {
        if (v == flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            v = flag;
            e(D());
            z();
        }
    }

    protected boolean f(String s1)
    {
        if (v())
        {
            if (s1 == g(((String) (null))))
            {
                return true;
            } else
            {
                android.content.SharedPreferences.Editor editor = c.e();
                editor.putString(m, s1);
                a(editor);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public CharSequence g()
    {
        return j;
    }

    protected String g(String s1)
    {
        if (!v())
        {
            return s1;
        } else
        {
            return c.c().getString(m, s1);
        }
    }

    public void g(int i1)
    {
        c(a.getString(i1));
        i = i1;
    }

    public void g(boolean flag)
    {
        if (w == flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            w = flag;
            e(D());
            z();
        }
    }

    public void h(int i1)
    {
        b(a.getString(i1));
    }

    public Intent j()
    {
        return n;
    }

    public String k()
    {
        return o;
    }

    public int l()
    {
        return y;
    }

    public int m()
    {
        return z;
    }

    public int n()
    {
        return g;
    }

    public CharSequence o()
    {
        return h;
    }

    public boolean p()
    {
        return q;
    }

    long q()
    {
        return d;
    }

    public String r()
    {
        return m;
    }

    void s()
    {
        if (m == null)
        {
            throw new IllegalStateException("Preference does not have a key assigned.");
        } else
        {
            r = true;
            return;
        }
    }

    public boolean t()
    {
        return !TextUtils.isEmpty(m);
    }

    public String toString()
    {
        return G().toString();
    }

    public boolean u()
    {
        return s;
    }

    protected boolean v()
    {
        return c != null && u() && t();
    }

    public void w()
    {
        s = true;
    }

    public Context x()
    {
        return a;
    }

    public SharedPreferences y()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.c();
        }
    }

    public void z()
    {
        if (b != null)
        {
            b.a();
        }
    }

    public void z_()
    {
    }
}
