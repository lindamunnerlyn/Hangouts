// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kwj;
import kwk;
import kwm;
import kwq;
import kws;

public final class clear extends kwm
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
            synchronized (kwq.a)
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

    public static _emptyArray parseFrom(kwj kwj1)
    {
        return (new <init>()).mergeFrom(kwj1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kws.mergeFrom(new <init>(), abyte0);
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
            i = j + kwk.b(1, profileId);
        }
        j = i;
        if (phoneNumber != null)
        {
            j = i + kwk.b(2, phoneNumber);
        }
        i = j;
        if (circleId != null)
        {
            i = j + kwk.b(3, circleId);
        }
        j = i;
        if (email != null)
        {
            j = i + kwk.b(4, email);
        }
        return j;
    }

    public email mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                profileId = kwj1.j();
                break;

            case 18: // '\022'
                phoneNumber = kwj1.j();
                break;

            case 26: // '\032'
                circleId = kwj1.j();
                break;

            case 34: // '"'
                email = kwj1.j();
                break;
            }
        } while (true);
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public void writeTo(kwk kwk1)
    {
        if (profileId != null)
        {
            kwk1.a(1, profileId);
        }
        if (phoneNumber != null)
        {
            kwk1.a(2, phoneNumber);
        }
        if (circleId != null)
        {
            kwk1.a(3, circleId);
        }
        if (email != null)
        {
            kwk1.a(4, email);
        }
        super.writeTo(kwk1);
    }

    public ()
    {
        clear();
    }
}
