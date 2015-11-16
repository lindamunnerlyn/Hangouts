// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;

public class hku extends hjr
{

    public boolean a;
    private CharSequence c;
    private CharSequence d;
    private boolean e;
    private boolean f;
    private boolean g;

    public hku(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean D()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (g)
            {
                flag = a;
            } else
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
                if (!super.D())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    protected Object a(TypedArray typedarray, int i)
    {
        return Boolean.valueOf(typedarray.getBoolean(i, false));
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(hkv))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (hkv)parcelable;
            super.a(parcelable.getSuperState());
            a(((hkv) (parcelable)).a);
            return;
        }
    }

    public void a(CharSequence charsequence)
    {
        c = charsequence;
        if (c())
        {
            z();
        }
    }

    public void a(boolean flag)
    {
        boolean flag1;
        if (a != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || !e)
        {
            a = flag;
            e = true;
            b(flag);
            if (flag1)
            {
                e(D());
                z();
            }
        }
    }

    protected void a(boolean flag, Object obj)
    {
        if (flag)
        {
            flag = c(a);
        } else
        {
            flag = ((Boolean)obj).booleanValue();
        }
        a(flag);
    }

    public void b(View view)
    {
        AccessibilityManager accessibilitymanager = (AccessibilityManager)x().getSystemService("accessibility");
        if (f && accessibilitymanager.isEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
            accessibilityevent.setEventType(1);
            view.onInitializeAccessibilityEvent(accessibilityevent);
            view.dispatchPopulateAccessibilityEvent(accessibilityevent);
            accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
        }
        f = false;
    }

    public void c(View view)
    {
        boolean flag = false;
        view = (TextView)view.findViewById(o.k);
        if (view != null)
        {
            boolean flag1 = true;
            int i;
            if (a && !TextUtils.isEmpty(c))
            {
                view.setText(c);
                i = 0;
            } else
            {
                i = ((flag1) ? 1 : 0);
                if (!a)
                {
                    i = ((flag1) ? 1 : 0);
                    if (!TextUtils.isEmpty(d))
                    {
                        view.setText(d);
                        i = 0;
                    }
                }
            }
            if (i != 0)
            {
                CharSequence charsequence = g();
                if (!TextUtils.isEmpty(charsequence))
                {
                    view.setText(charsequence);
                    i = 0;
                }
            }
            if (i == 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            if (i != view.getVisibility())
            {
                view.setVisibility(i);
            }
        }
    }

    public boolean c()
    {
        return a;
    }

    public void d(CharSequence charsequence)
    {
        d = charsequence;
        if (!c())
        {
            z();
        }
    }

    protected Parcelable e()
    {
        Object obj = super.e();
        if (u())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new hkv(((Parcelable) (obj)));
            obj.a = c();
            return ((Parcelable) (obj));
        }
    }

    public void h(boolean flag)
    {
        g = flag;
    }

    protected void z_()
    {
        super.z_();
        boolean flag;
        if (!c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = true;
        if (!a(Boolean.valueOf(flag)))
        {
            return;
        } else
        {
            a(flag);
            return;
        }
    }
}
