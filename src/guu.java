// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;

final class guu extends Property
{

    guu(Class class1, String s)
    {
        super(class1, s);
    }

    public Object get(Object obj)
    {
        return Float.valueOf(((View)obj).getHeight());
    }

    public void set(Object obj, Object obj1)
    {
        View view = (View)obj;
        obj1 = (Float)obj1;
        obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = new android.view.ViewGroup.LayoutParams(-2, ((Float) (obj1)).intValue());
        } else
        {
            obj.height = ((Float) (obj1)).intValue();
        }
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        view.requestLayout();
    }
}
