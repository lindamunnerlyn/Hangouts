// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneNumberUtils;
import android.text.Spanned;
import android.text.method.DialerKeyListener;

public final class bnc extends DialerKeyListener
{

    public static final bnc a = new bnc();

    public bnc()
    {
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        String s;
label0:
        {
            s = charsequence.toString();
            Object obj = new StringBuilder(s.length());
            char ac[] = s.toCharArray();
            int j1 = ac.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                char c = ac[i1];
                int k1 = Character.digit(c, 10);
                if (k1 != -1)
                {
                    ((StringBuilder) (obj)).append(k1);
                } else
                {
                    ((StringBuilder) (obj)).append(c);
                }
                i1++;
            }
            ac = PhoneNumberUtils.convertKeypadLettersToDigits(((StringBuilder) (obj)).toString());
            obj = super.filter(ac, i, j, spanned, k, l);
            spanned = ((Spanned) (obj));
            if (obj == null)
            {
                if (!charsequence.equals(ac))
                {
                    break label0;
                }
                spanned = null;
            }
            return spanned;
        }
        return ac.subSequence(i, j);
    }

}
