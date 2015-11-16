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

public class bdz
{

    AtomicBoolean a;
    private final Context b;
    private List c;

    bdz(Context context)
    {
        a = new AtomicBoolean(true);
        b = context;
        g.a(context).a(new bea(this));
    }

    public boolean a()
    {
        String s;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return false;
        }
        s = android.provider.Settings.Secure.getString(b.getContentResolver(), "default_input_method");
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (a.compareAndSet(true, false))
        {
            Object obj = g.a(b, "babel_allowed_emoji_imes", "com.google.android.inputmethod.latin/");
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = null;
            } else
            {
                obj = Arrays.asList(((String) (obj)).split(","));
            }
            c = ((List) (obj));
        }
        if (c == null) goto _L4; else goto _L3
_L3:
        obj = c.iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        if (!s.startsWith((String)((Iterator) (obj)).next())) goto _L7; else goto _L6
_L6:
        flag = true;
_L9:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return false;
_L4:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        InputMethodSubtype inputmethodsubtype = ((InputMethodManager)b.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (inputmethodsubtype == null)
        {
            return false;
        } else
        {
            return inputmethodsubtype.containsExtraValueKey("EmojiCapable");
        }
    }
}
