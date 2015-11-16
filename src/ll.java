// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Comparator;

public final class ll
    implements Comparator
{

    public ll()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (View)obj1;
        obj = (le)((View) (obj)).getLayoutParams();
        obj1 = (le)((View) (obj1)).getLayoutParams();
        if (((le) (obj)).a != ((le) (obj1)).a)
        {
            return !((le) (obj)).a ? -1 : 1;
        } else
        {
            return ((le) (obj)).e - ((le) (obj1)).e;
        }
    }
}
