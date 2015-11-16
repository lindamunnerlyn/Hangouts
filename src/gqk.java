// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;

final class gqk extends Property
{

    private Property a;
    private Property b;
    private float c;

    public gqk(Property property, Property property1, String s)
    {
        super(java/lang/Float, s);
        a = property;
        b = property1;
        c = 0.5F;
    }

    public Object get(Object obj)
    {
        obj = (View)obj;
        float f = ((Float)b.get(obj)).floatValue();
        return Float.valueOf(((Float)a.get(obj)).floatValue() * c + f);
    }

    public void set(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (Float)obj1;
        b.set(obj, Float.valueOf(((Float) (obj1)).floatValue() - ((Float)a.get(obj)).floatValue() * c));
    }
}
