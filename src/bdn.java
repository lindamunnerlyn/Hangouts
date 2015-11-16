// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class bdn
{

    private final Context a;
    private List b;
    private AtomicBoolean c;

    bdn(Context context)
    {
        c = new AtomicBoolean(true);
        a = context;
        g.a(context).a(new bdo(this));
    }

    static AtomicBoolean a(bdn bdn1)
    {
        return bdn1.c;
    }

    public boolean a()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return false;
        }
        String s = android.provider.Settings.Secure.getString(a.getContentResolver(), "default_input_method");
        if (c.compareAndSet(true, false))
        {
            Object obj = g.a(a, "babel_allowed_emoji_imes", "com.google.android.inputmethod.latin/");
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = null;
            } else
            {
                obj = Arrays.asList(((String) (obj)).split(","));
            }
            b = ((List) (obj));
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        obj = b.iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        if (!s.startsWith((String)((Iterator) (obj)).next())) goto _L5; else goto _L4
_L4:
        flag = true;
_L7:
        if (!flag)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        InputMethodSubtype inputmethodsubtype = ((InputMethodManager)a.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (inputmethodsubtype == null)
        {
            return false;
        } else
        {
            return inputmethodsubtype.containsExtraValueKey("EmojiCapable");
        }
    }
}
