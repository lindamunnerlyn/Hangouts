// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import java.util.Locale;

public final class aha
    implements TextWatcher
{

    private boolean a;
    private boolean b;
    private goq c;

    public aha()
    {
        this(Locale.getDefault().getCountry());
    }

    public aha(String s)
    {
        a = false;
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            c = gpb.b().g(s);
            return;
        }
    }

    private String a(char c1, boolean flag)
    {
        if (flag)
        {
            return c.b(c1);
        } else
        {
            return c.a(c1);
        }
    }

    private void a()
    {
        b = true;
        c.a();
    }

    private static boolean a(CharSequence charsequence, int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            if (!PhoneNumberUtils.isNonSeparator(charsequence.charAt(k)))
            {
                return true;
            }
        }

        return false;
    }

    public void a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            c = gpb.b().g(s);
            a = false;
            b = false;
            return;
        }
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        if (editable.length() == 0)
        {
            flag = false;
        }
        b = flag;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a) goto _L4; else goto _L3
_L3:
        int j = Selection.getSelectionEnd(editable);
        String s = null;
        int k;
        c.a();
        k = editable.length();
        char c1;
        int i;
        i = 0;
        flag = false;
        c1 = '\0';
_L8:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        char c2;
        c2 = editable.charAt(i);
        if (!PhoneNumberUtils.isNonSeparator(c2))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        boolean flag1;
        flag1 = flag;
        if (c1 == 0)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        s = a(c1, flag);
        flag1 = false;
        break MISSING_BLOCK_LABEL_212;
        if (c1 == 0) goto _L6; else goto _L5
_L5:
        s = a(c1, flag);
_L6:
        if (s == null) goto _L4; else goto _L7
_L7:
        i = c.b();
        a = true;
        editable.replace(0, editable.length(), s, 0, s.length());
        if (s.equals(editable.toString()))
        {
            Selection.setSelection(editable, i);
        }
        a = false;
          goto _L4
        editable;
        throw editable;
        c1 = c2;
        flag = flag1;
        if (i == j - 1)
        {
            flag = true;
        }
        i++;
          goto _L8
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (a || b || j <= 0 || !a(charsequence, i, j)) 
        {
            return;
        }
        a();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (a || b || k <= 0 || !a(charsequence, i, k)) 
        {
            return;
        }
        a();
    }
}
