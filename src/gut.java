// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;

final class gut extends Property
{

    gut(Class class1, String s)
    {
        super(class1, s);
    }

    public Object get(Object obj)
    {
        return Float.valueOf(((View)obj).getWidth());
    }

    public void set(Object obj, Object obj1)
    {
        View view = (View)obj;
        obj1 = (Float)obj1;
        obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = new android.view.ViewGroup.LayoutParams(((Float) (obj1)).intValue(), -2);
        } else
        {
            obj.width = ((Float) (obj1)).intValue();
        }
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        view.requestLayout();
    }
}
