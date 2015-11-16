// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lnu extends IllegalArgumentException
{

    private static final long serialVersionUID = 0x578263712b904f39L;
    private final lnj a;
    private final lns b;
    private final String c;
    private final Number d;
    private final String e;
    private final Number f;
    private final Number g;
    private String h;

    public lnu(lnj lnj1, Number number, Number number1, Number number2)
    {
        super(a(lnj1.x(), number, number1, number2, null));
        a = lnj1;
        b = null;
        c = lnj1.x();
        d = number;
        e = null;
        f = number1;
        g = number2;
        h = super.getMessage();
    }

    public lnu(lnj lnj1, Number number, String s)
    {
        super(a(lnj1.x(), number, null, null, s));
        a = lnj1;
        b = null;
        c = lnj1.x();
        d = number;
        e = null;
        f = null;
        g = null;
        h = super.getMessage();
    }

    public lnu(lnj lnj1, String s)
    {
        String s1 = lnj1.x();
        StringBuffer stringbuffer = new StringBuffer("Value ");
        if (s == null)
        {
            stringbuffer.append("null");
        } else
        {
            stringbuffer.append('"');
            stringbuffer.append(s);
            stringbuffer.append('"');
        }
        stringbuffer.append(" for ").append(s1).append(' ').append("is not supported");
        super(stringbuffer.toString());
        a = lnj1;
        b = null;
        c = lnj1.x();
        e = s;
        d = null;
        f = null;
        g = null;
        h = super.getMessage();
    }

    private static String a(String s, Number number, Number number1, Number number2, String s1)
    {
        s = (new StringBuilder("Value ")).append(number).append(" for ").append(s).append(' ');
        if (number1 == null)
        {
            if (number2 == null)
            {
                s.append("is not supported");
            } else
            {
                s.append("must not be larger than ").append(number2);
            }
        } else
        if (number2 == null)
        {
            s.append("must not be smaller than ").append(number1);
        } else
        {
            s.append("must be in the range [").append(number1).append(',').append(number2).append(']');
        }
        if (s1 != null)
        {
            s.append(": ").append(s1);
        }
        return s.toString();
    }

    public void a(String s)
    {
        if (h == null)
        {
            h = s;
        } else
        if (s != null)
        {
            String s1 = h;
            h = (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(": ").append(s1).toString();
            return;
        }
    }

    public String getMessage()
    {
        return h;
    }
}
