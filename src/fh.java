// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

class fh extends fg
{

    fh()
    {
    }

    public void b(Drawable drawable, int i)
    {
        if (!h.b)
        {
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("setLayoutDirection", new Class[] {
                    Integer.TYPE
                });
                h.a = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
            h.b = true;
        }
        if (h.a == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        h.a.invoke(drawable, new Object[] {
            Integer.valueOf(i)
        });
        return;
        drawable;
        h.a = null;
        return;
    }

    public int d(Drawable drawable)
    {
        int i = h.a(drawable);
        if (i < 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }
}
