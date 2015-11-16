// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class kxg extends DefaultHandler
{

    HashMap a;
    Stack b;

    kxg()
    {
        a = new HashMap();
        b = new Stack();
    }

    public void endElement(String s, String s1, String s2)
    {
        if (b.size() > 0)
        {
            s = (kxh)b.lastElement();
            ((kxh) (s)).c.append("</");
            ((kxh) (s)).c.append(s1);
            ((kxh) (s)).c.append(">");
            s.b = ((kxh) (s)).b - 1;
            if (((kxh) (s)).b == 0)
            {
                s1 = ((kxh) (s)).c.toString();
                a.put(((kxh) (s)).a, s1);
                b.pop();
                if (b.size() > 0)
                {
                    ((kxh)b.lastElement()).c.append(s1);
                }
            }
        }
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
    {
        s = attributes.getValue("id");
        if (s != null)
        {
            s = new kxh(this, s);
            b.push(s);
        }
        if (b.size() > 0)
        {
            s = (kxh)b.lastElement();
            s.b = ((kxh) (s)).b + 1;
            s = ((kxh) (s)).c;
            s.append("<");
            s.append(s1);
            for (int i = 0; i < attributes.getLength(); i++)
            {
                s.append(" ");
                s.append(attributes.getQName(i));
                s.append("='");
                s.append(kxd.a(attributes.getValue(i)));
                s.append("'");
            }

            s.append(">");
        }
    }
}
