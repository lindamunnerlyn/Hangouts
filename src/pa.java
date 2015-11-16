// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;
import java.lang.reflect.Method;

class pa extends pc
{

    pa()
    {
    }

    public void a(PopupWindow popupwindow, int i)
    {
        if (!h.j)
        {
            try
            {
                Method method = android/widget/PopupWindow.getDeclaredMethod("setWindowLayoutType", new Class[] {
                    Integer.TYPE
                });
                h.i = method;
                method.setAccessible(true);
            }
            catch (Exception exception) { }
            h.j = true;
        }
        if (h.i == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        h.i.invoke(popupwindow, new Object[] {
            Integer.valueOf(2)
        });
        return;
        popupwindow;
    }
}
