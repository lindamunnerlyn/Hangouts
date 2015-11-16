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

    private static volatile serverCreateRedirectEnd _emptyArray[];
    public Long clientLaunch;
    public Long serverCreateRedirectEnd;
    public Long serverCreateRoomEnd;
    public Long serverCreateRoomStart;

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
        clientLaunch = null;
        serverCreateRoomStart = null;
        serverCreateRoomEnd = null;
        serverCreateRedirectEnd = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientLaunch != null)
        {
            i = j + kwk.e(1, clientLaunch.longValue());
        }
        j = i;
        if (serverCreateRoomStart != null)
        {
            j = i + kwk.e(2, serverCreateRoomStart.longValue());
        }
        i = j;
        if (serverCreateRoomEnd != null)
        {
            i = j + kwk.e(3, serverCreateRoomEnd.longValue());
        }
        j = i;
        if (serverCreateRedirectEnd != null)
        {
            j = i + kwk.e(4, serverCreateRedirectEnd.longValue());
        }
        return j;
    }

    public serverCreateRedirectEnd mergeFrom(kwj kwj1)
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

            case 8: // '\b'
                clientLaunch = Long.valueOf(kwj1.e());
                break;

            case 16: // '\020'
                serverCreateRoomStart = Long.valueOf(kwj1.e());
                break;

            case 24: // '\030'
                serverCreateRoomEnd = Long.valueOf(kwj1.e());
                break;

            case 32: // ' '
                serverCreateRedirectEnd = Long.valueOf(kwj1.e());
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
        if (clientLaunch != null)
        {
            kwk1.b(1, clientLaunch.longValue());
        }
        if (serverCreateRoomStart != null)
        {
            kwk1.b(2, serverCreateRoomStart.longValue());
        }
        if (serverCreateRoomEnd != null)
        {
            kwk1.b(3, serverCreateRoomEnd.longValue());
        }
        if (serverCreateRedirectEnd != null)
        {
            kwk1.b(4, serverCreateRedirectEnd.longValue());
        }
        super.writeTo(kwk1);
    }

    public ()
    {
        clear();
    }
}
