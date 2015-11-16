// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koh;
import koj;
import kon;
import kop;

public final class clear extends koj
{

    private static volatile email _emptyArray[];
    public String circleId;
    public String email;
    public String phoneNumber;
    public String profileId;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kon.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kog kog1)
    {
        return (new <init>()).mergeFrom(kog1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kop.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        profileId = null;
        phoneNumber = null;
        circleId = null;
        email = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (profileId != null)
        {
            i = j + koh.b(1, profileId);
        }
        j = i;
        if (phoneNumber != null)
        {
            j = i + koh.b(2, phoneNumber);
        }
        i = j;
        if (circleId != null)
        {
            i = j + koh.b(3, circleId);
        }
        j = i;
        if (email != null)
        {
            j = i + koh.b(4, email);
        }
        return j;
    }

    public email mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                profileId = kog1.j();
                break;

            case 18: // '\022'
                phoneNumber = kog1.j();
                break;

            case 26: // '\032'
                circleId = kog1.j();
                break;

            case 34: // '"'
                email = kog1.j();
                break;
            }
        } while (true);
    }

    public volatile kop mergeFrom(kog kog1)
    {
        return mergeFrom(kog1);
    }

    public void writeTo(koh koh1)
    {
        if (profileId != null)
        {
            koh1.a(1, profileId);
        }
        if (phoneNumber != null)
        {
            koh1.a(2, phoneNumber);
        }
        if (circleId != null)
        {
            koh1.a(3, circleId);
        }
        if (email != null)
        {
            koh1.a(4, email);
        }
        super.writeTo(koh1);
    }

    public ()
    {
        clear();
    }
}
